interface GeometricShape {
    // Методы для получения цветов
    String getFillColor();
    String getBorderColor();

    // Дефолтные методы для расчета периметра и площади
    default double calculatePerimeter() {
        return 0;
    }

    default double calculateArea() {
        return 0;
    }

    // Метод для вывода информации о фигуре
    default void printInfo() {
        System.out.println("Периметр: " + calculatePerimeter() +
                ", Площадь: " + calculateArea() +
                ", Цвет фона: " + getFillColor() +
                ", Цвет границ: " + getBorderColor());
    }
}

// Класс Круг
class Circle implements GeometricShape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Класс Прямоугольник
class Rectangle implements GeometricShape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Класс Треугольник
class Triangle implements GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        // Используем формулу Герона
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class Figure {
    public static void main(String[] args) {
        // Создаем фигуры
        GeometricShape circle = new Circle(5, "Красный", "Черный");
        GeometricShape rectangle = new Rectangle(4, 6, "Зеленый", "Синий");
        GeometricShape triangle = new Triangle(3, 4, 5, "Желтый", "Коричневый");

        // Выводим информацию о фигурах
        System.out.println("Круг:");
        circle.printInfo();

        System.out.println("\nПрямоугольник:");
        rectangle.printInfo();

        System.out.println("\nТреугольник:");
        triangle.printInfo();
    }
}