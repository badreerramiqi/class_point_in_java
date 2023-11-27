// Main class to demonstrate the Point class functionality
public class Mainp {
    public static void main(String[] args) {
        // Create a Point object with coordinates (47, 89)
        Point point1 = new Point(47, 89);

        // Print the Euclidean distance between the point and itself
        System.out.println("The distance is: " + point1.distance(point1));

        // Print the Euclidean norm of the point
        System.out.println("The norm is: " + point1.norm());
    }
}

