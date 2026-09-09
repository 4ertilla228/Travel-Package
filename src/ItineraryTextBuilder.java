public class ItineraryTextBuilder implements TravelPackageBuilder {
    private final StringBuilder itinerary = new StringBuilder("=== Travel Itinerary ===\n");

    @Override
    public ItineraryTextBuilder setDestination(String destination){
        itinerary.append("Destination: ").append(destination).append("\n");
        return this;
    }

    @Override
    public ItineraryTextBuilder setDays(int days){
        itinerary.append("Days: ").append(days).append("\n");
        return this;
    }
    @Override
    public ItineraryTextBuilder setTransport(String transport){
        itinerary.append("Transport: ").append(transport).append("\n");
        return this;
    }
    @Override
    public ItineraryTextBuilder setAccommodation(String accommodation){
        itinerary.append("Hotel: ").append(accommodation).append("\n");
        return this;
    }

    public String getResult(){
        if (itinerary.length() < 30){
            throw new IllegalStateException("Val error: Itinerary is empty, components are missing");
        }
        return itinerary.toString();
    }
}
