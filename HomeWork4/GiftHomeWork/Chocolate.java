package HomeWork4.GiftHomeWork;

public class Chocolate {
    private double weight;
    private double price;
    private String color;

    public Chocolate(double weight, double price, String color) {
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + weight +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
