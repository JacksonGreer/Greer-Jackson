import java.util.Scanner;

public class Equestria {


    public double roadTrip(double diameter) {
        return Math.PI * diameter;
    }

    public double distance(City a, City b) {
        double result = Math.sqrt(Math.pow(b.getXCoordinate() - a.getXCoordinate(), 2) 
        + Math.pow(b.getYCoordinate() - a.getYCoordinate(), 2));
        return result;

    }

    public double totalTrip(City start, City a, City b, City c, City d) {
        double totalDistance;
        totalDistance = distance(start, a);
        totalDistance += distance(a, b);
        totalDistance += distance(b, c);
        totalDistance += distance(c, d);
        totalDistance += distance(d, start);

        return totalDistance;
    }
    public static void main(String[] args){

        // Scanner in = new Scanner(System.in);
        // double diameter = in.nextDouble();
        // in.close();

        Equestria quest = new Equestria();
        // calculate circumference for a given diameter
        double circumference = quest.roadTrip(42.0);
        System.out.println("Circumference of road trip is " + circumference + " miles.");

        // calculate distance between Baltimare & Manehattan
        City baltimare = new City(29, 16);
        City manehattan = new City(34, 8);
        double distance = quest.distance(baltimare, manehattan);
        System.out.println("Distance between Baltimare & Manehattan is " + distance + " miles.");

        City losPegasus = new City(6, 19);
        City neighagraFalls = new City(22, 7);
        distance = quest.distance(losPegasus, neighagraFalls);
        System.out.println("Distance between Los Pegasus & Neighagra falls is " + distance + " miles.");

        City badlands = new City(25, 24);
        City ponyville = new City(16, 14);
        distance = quest.distance(badlands, ponyville);
        System.out.println("Distance between Badlands & Ponyville is " + distance + " miles.");

        City startingLocation = new City(0,0);
        City cloudsdale = new City(15,7);
        double distanceToCloudsdale = quest.distance(startingLocation, cloudsdale);
        System.out.println("Luna's travel distance from start to Cloudsdale is " + distanceToCloudsdale + " miles.");

        City sanPalomino = new City(9,21);
        double distanceToSanPalomino = quest.distance(cloudsdale, sanPalomino);
        System.out.println("Luna's travel distance from Cloudsdale to San Palomino is " + distanceToSanPalomino + " miles.");

        City canterlot = new City(19,8);
        double distanceToCanterlot = quest.distance(sanPalomino, canterlot);
        System.out.println("Luna's travel distance from San Palomino to Canterlot is " + distanceToCanterlot + " miles.");
        
        double totalDistance = quest.totalTrip(startingLocation, cloudsdale, sanPalomino, canterlot, manehattan);
        System.out.println("The total distance of Luna's trip is " + totalDistance + " miles.");
    }
}

class City {
    private int x;
    private int y;

    public City(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXCoordinate() {
        return this.x;
    }

    public int getYCoordinate() {
        return this.y;
    }
}
