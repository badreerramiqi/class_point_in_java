// Class representing a point in a two-dimensional space
public class Point {
    
    private float x; // x-coordinate of the point
    private float y; // y-coordinate of the point

    // Default constructor, initializes the point to the origin (0, 0)
    Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor, allows initializing the point with specific coordinates
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter method to retrieve the x-coordinate of the point
    public float getX() {
        return x;
    }

    // Getter method to retrieve the y-coordinate of the point
    public float getY() {
        return y;
    }
    
    // Setter method to set the x-coordinate of the point
    public void setX(float x) {
        this.x = x;
    }

    // Setter method to set the y-coordinate of the point
    public void setY(float y) {
        this.y = y;
    }

    // Method to calculate the Euclidean distance between two points
    public float distance(Point point1) {
        float d = (float) Math.sqrt(Math.pow((point1.getX() - this.getX()), 2) + Math.pow((point1.getY() - this.getY()), 2));
        return d;
    }

    // Method to calculate the Euclidean norm of the point
    public float norm() {
        float n = (float) Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
        return n;
    }
}