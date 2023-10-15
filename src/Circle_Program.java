import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double surface() {
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean isInternal(double x, double y) {
        double distance = Math.sqrt(Math.pow((x - center.getX()), 2) + Math.pow((y - center.getY()), 2));
        return distance <= radius;
    }
}

public class Circle_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle[] circles = new Circle[3];

        for (int i = 0; i < circles.length; i++) {
            System.out.println("Enter radius for circle " + (i + 1) + ": ");
            double radius = scanner.nextDouble();

            System.out.println("Enter x coordinate for center of circle " + (i + 1) + ": ");
            double x = scanner.nextDouble();

            System.out.println("Enter y coordinate for center of circle " + (i + 1) + ": ");
            double y = scanner.nextDouble();

            Point center = new Point(x, y);
            circles[i] = new Circle(radius, center);
        }

        System.out.println("Enter x coordinate of point to test: ");
        double xTest = scanner.nextDouble();

        System.out.println("Enter y coordinate of point to test: ");
        double yTest = scanner.nextDouble();

        for (int i = 0; i < circles.length; i++) {
            Circle circle = circles[i];
            System.out.println("Circle " + (i + 1) + ":");
            System.out.println("Surface: " + circle.surface());
            System.out.println("Is the point inside? " + circle.isInternal(xTest, yTest));
        }
    }
}
