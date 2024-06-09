public class Main {
    public static void main(String[] args) {
        for(Planet planet : Planet.values()){
            System.out.printf("Planet: " + planet + "\n");
            System.out.printf("Order number: " + planet.getOrderNo() + "\n");
            System.out.printf("Distance: " + planet.getDistance() + " million km\n");
            System.out.printf("Radius: " + planet.getRadius() + " km\n");
            System.out.printf("Rotation Time: " + planet.getRotationTime() + " days\n");
            System.out.println();
        }
    }
}