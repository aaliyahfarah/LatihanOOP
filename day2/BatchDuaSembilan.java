package day2;

public class BatchDuaSembilan {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10f, 2f, 5f);

        triangle.result("Prisma Segitiga","around");

        Square square = new Square(2f);
        triangle.result("Kubus","around");

        Circle circle = new Circle(5f);
        triangle.result("Bola","around");
    }
        
}


