class Rectangle {
    double width, height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width + height) * 2;
    }
}

class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;

    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    double getChangePercent() {
        double result = currentPrice - previousClosingPrice;
        result /= (currentPrice + previousClosingPrice) / 2;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\tЗадание 1\n");

        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Ширина: " + r1.width);
        System.out.println("Высота: " + r1.height);
        System.out.println("Площадь: " + r1.getArea());
        System.out.println("Периметр: " + r1.getPerimeter());

        System.out.println("Ширина: " + r2.width);
        System.out.println("Высота: " + r2.height);
        System.out.println("Площадь: " + r2.getArea());
        System.out.println("Периметр: " + r2.getPerimeter());

        System.out.println("\n\tЗадание 2\n");

        Stock s1 = new Stock("SBER", "ПАО Сбербанк");
        s1.previousClosingPrice = 281.50;
        s1.currentPrice = 282.87;
        double res = (double)Math.round(s1.getChangePercent() * 100000) / 1000;

        System.out.println("[" + s1.symbol + "]\t" + s1.name);
        System.out.println(s1.previousClosingPrice + "\t→\t" + s1.currentPrice);
        if (res > 0) System.out.print("\t↑ +");
        if (res == 0) System.out.print("\t   ");
        if (res < 0) System.out.print("\t↓ -");
        System.out.println(res + "%");
    }
}