public class TravelDirector {
    private static final String LUXURY_DESTINATION = "Maldives";
    private static final String LUXURY_TRANSPORT = "Luxury";
    private static final String LUXURY_ACCOMMODATION = "5 star villa";
    private static final int LUXURY_DAYS = 14;

    private static final String WEEKEND_DESTINATION = "Paris";
    private static final String WEEKEND_TRANSPORT = "Train";
    private static final String WEEKEND_ACCOMMODATION = "4 star hotel";
    private static final int WEEKEND_DAYS = 7;

    public void makeLuxuryVacation(TravelPackageBuilder builder) {
        builder.setDestination(LUXURY_DESTINATION)
                .setDays(LUXURY_DAYS)
                .setTransport(LUXURY_TRANSPORT)
                .setAccommodation(LUXURY_ACCOMMODATION);
    }

    public void makeWeekendGetaway(TravelPackageBuilder builder) {
        builder.setDestination(WEEKEND_DESTINATION)
                .setDays(WEEKEND_DAYS)
                .setTransport(WEEKEND_TRANSPORT)
                .setAccommodation(WEEKEND_ACCOMMODATION);
    }
}