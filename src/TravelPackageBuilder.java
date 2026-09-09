public interface TravelPackageBuilder {
    TravelPackageBuilder setDestination(String destination);
    TravelPackageBuilder setDays(int days);
    TravelPackageBuilder setTransport(String transport);
    TravelPackageBuilder setAccommodation(String accommodation);
}