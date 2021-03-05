package HomeWork4.GiftHomeWork;

public class Gift {
    private Chocolate chocolate;
    private Jellybean jellybean;
    private Lollipop lollipop;

    private double weight;
    private double price;

    public Gift(Chocolate chocolate, Jellybean jellybean, Lollipop lollipop) {
        this.chocolate = chocolate;
        this.jellybean = jellybean;
        this.lollipop = lollipop;
    }

    public double getWeight() {
        return chocolate.getWeight() + jellybean.getWeight() + lollipop.getWeight();
    }

    public double getPrice() {
        return chocolate.getPrice() + jellybean.getPrice() + lollipop.getPrice();
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public Jellybean getJellybean() {
        return jellybean;
    }

    public Lollipop getLollipop() {
        return lollipop;
    }
}
