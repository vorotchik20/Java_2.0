package HomeWork4.GiftHomeWork;

public class Lollipop {
    private double weight;
    private double price;
    private String taste;

    public Lollipop(double weight, double price, String taste) {
        this.weight = weight;
        this.price = price;
        this.taste = taste;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "Lollipop{" +
                "weight=" + weight +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
