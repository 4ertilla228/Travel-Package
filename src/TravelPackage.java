//Продкут

public class TravelPackage {
    private final String destination;
    private final int days;
    private final String transport;
    private final String accommodation;

    TravelPackage(String destination, int days, String transport, String accommodation) {
        this.destination = destination;
        this.days = days;
        this.transport = transport;
        this.accommodation = accommodation;
    }

    @Override
    public String toString() {
        return "TravelPackage [Destination=" + destination
                + ", Days=" + days + ", Transport=" + transport +
                ", Accommodation=" + accommodation + "]";
    }
}