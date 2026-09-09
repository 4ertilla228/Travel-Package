public class ItineraryTextBuilder implements TravelPackageBuilder {
    private final StringBuilder itenerary = new StringBuilder("=== Travel Itinerary ===\n");

    @Override
    public ItineraryTextBuilder setDestination(String destination){
        itenerary.append("Destination: ").append(destination).append("\n");
        return this;
    }

    @Override
    public ItineraryTextBuilder setDays(int days){
        itenerary.append("Days: ").append(days).append("\n");
        return this;
    }
    @Override
    public ItineraryTextBuilder setTransport(String transport){
        itenerary.append("Transport: ").append(transport).append("\n");
        return this;
    }
    @Override
    public ItineraryTextBuilder setAccommodation(String accommodation){
        itenerary.append("Hotel: ").append(accommodation).append("\n");
        return this;
    }

    public String getResult(){
        if (itinerary.length() < 30){
            return new IllegalStateException("Val error: Itinerary is empty, components are missing");
        }
        return itenerary.toString();
    }
}
