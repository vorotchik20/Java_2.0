package HomeWork4.GiftHomeWork;

public class Jellybean {
    private double weight;
    private double price;
    private String size;

    public Jellybean(double weight, double price, String size) {
        this.weight = weight;
        this.price = price;
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Jellybean{" +
                "weight=" + weight +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
