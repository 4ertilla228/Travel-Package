public class JsonPackageBuilder implements TravelPackageBuilder {
        private String destination;
        private int days;
        private String transport;
        private String accommodation;

        @Override
        public JsonPackageBuilder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        @Override
        public JsonPackageBuilder setDays(int days) {
            this.days = days;
            return this;
        }

        @Override
        public JsonPackageBuilder setTransport(String transport) {
            this.transport = transport;
            return this;
        }

        @Override
        public JsonPackageBuilder setAccommodation(String accommodation) {
            this.accommodation = accommodation;
            return this;
        }

        public String getResult() {
            if (destination == null || transport == null) {
                throw new IllegalStateException("Validation Error: Missing JSON data");
            }

            return "{\n" +
                    "  \"destination\": \"" + destination + "\",\n" +
                    "  \"days\": " + days + ",\n" +
                    "  \"transport\": \"" + transport + "\",\n" +
                    "  \"accommodation\": \"" + accommodation + "\"\n" +
                    "}";
        }
}