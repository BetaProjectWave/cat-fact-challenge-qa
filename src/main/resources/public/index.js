const event_bus = new Vue();

Vue.component('fact_form', {
    data: function () {
        return {
            fact_limit: null,
            has_results: false
        };
    },
    methods: {
        onSubmit: function () {
            console.log("Submit button clicked with fact limit:", this.fact_limit);

            // Emit a custom event
            event_bus.$emit('fact_limit_change', this.fact_limit);
        },
        onClear: function () {

            console.log("Clear triggered for cat facts.");

            event_bus.$emit('fact_clear');
        }
    },
    computed: {
        isClearDisabled() {
            return !this.has_results;
        }
    },
    created () {

        let instance = this;

        event_bus.$on('fetched_facts', (facts) => {
            instance.has_results = facts.length > 0;
        });
    },
    template: '#fact_form'
})

Vue.component('fact_results', {
    data: function () {
        return {
            facts: [],
            message: null
        };
    },
    created() {

        let instance = this;

        event_bus.$on('fact_limit_change', async (limit) => {

            // Reset
            instance.facts = [];
            instance.message = "Fetching...";

            try {
                // Fetch facts from remote API.
                let result = await axios.get(`./facts?limit=${limit}`)

                // Store the fact results.
                instance.facts = result.data;
                instance.message = null;
            } catch (e) {
                console.error("API Error", e);
                instance.message = e;
            }

            // Share the facts that were fetched.
            event_bus.$emit('fetched_facts', instance.facts);
        })


        event_bus.$on('fact_clear', () => {
            instance.facts = [];

            // Facts cleared
            event_bus.$emit('fetched_facts', instance.facts);
        });

    },
    template: '#fact_results'
})

// Root
new Vue({
    el: '#app'
})




