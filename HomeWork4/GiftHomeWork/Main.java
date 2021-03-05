package HomeWork4.GiftHomeWork;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift(new Chocolate(124, 11.50, "white"),
                new Jellybean(230, 3.10, "big"),
                new Lollipop(56, 1.45, "cherry"));

        System.out.println(gift.getWeight());
        System.out.println(gift.getPrice());

        System.out.println(gift.getChocolate().toString());
        System.out.println(gift.getJellybean().toString());
        System.out.println(gift.getLollipop().toString());
    }
}
