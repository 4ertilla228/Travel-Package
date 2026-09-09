import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelDirector director = new TravelDirector();

        System.out.println("Select a package to build:");
        System.out.println("1. Luxury Vacation");
        System.out.println("2. Weekend Getaway");
        System.out.print("Your choice (1 or 2): ");
        int choice = scanner.nextInt();

        PackageObjectBuilder objectBuilder = new PackageObjectBuilder();
        ItineraryTextBuilder textBuilder = new ItineraryTextBuilder();

        if (choice == 1) {
            director.makeLuxuryVacation(objectBuilder);
            director.makeLuxuryVacation(textBuilder);
        } else if (choice == 2) {
            director.makeWeekendGetaway(objectBuilder);
            director.makeWeekendGetaway(textBuilder);
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        TravelPackage travelPackage = objectBuilder.getResult();
        System.out.println("\n--- Representation 1: Object ---");
        System.out.println(travelPackage.toString());

        String itinerary = textBuilder.getResult();
        System.out.println("\n--- Representation 2: Itinerary ---");
        System.out.println(itinerary);

        scanner.close();
    }
}