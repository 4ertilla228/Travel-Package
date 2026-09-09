public class PackageObjectBuilder implements TravelPackageBuilder {
    private String destination;
    private int days;
    private String transport;
    private String accommodation;

    @Override
    public PackageObjectBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    @Override
    public PackageObjectBuilder setDays(int days) {
        this.days = days;
        return this;
    }
    @Override
    public PackageObjectBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }
    @Override
    public PackageObjectBuilder setAccommodation(String accommodation) {
        this.accommodation = accommodation;
        return this;
    }

    private void valideState() {
        if (destination == null || destination.trim().isEmpty()) {
            throw new IllegalStateException("Val Error: Destination cannot be empty");
        }
        if  (days <= 0 || days > 31) {
            throw new IllegalStateException("Val Error: Days must be between 1 and 31");
        }
    }

    public TravelPackage getResult() {
        valideState();
        return new TravelPackage(destination, days, transport, accommodation);
    }
}