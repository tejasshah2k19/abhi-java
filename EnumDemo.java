import static java.lang.Math.*;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Drink.LARGE);// LARGE : 15
        // System.out.println(Drink.LARGE.value);//15
        System.out.println(Drink.LARGE.getValue());// 15

        System.out.println(Math.sqrt(9));
        System.out.println(sqrt(9));// ? from where i will get sqrt ?
        // System.out.println(sqrt2(9));

        System.out.println("--------------------------");

        // System.out.println(Drink.SMALL.value);

        System.out.println(Drink.SMALL.getValue());
        // System.out.println(Drink.LARGE.value);
        System.out.println(Drink.LARGE.getValue());
        // System.out.println(Drink.XLARGE.value);
        System.out.println(Drink.XLARGE.getValue());

        System.out.println(Drink.values());// S LAR XLAR

        for (Drink x : Drink.values()) {
            // System.out.println(x.value);
            System.out.println(x.getValue());
            System.out.println(x.ordinal());
        }

        System.out.println("How much Qty ?");
        String qty = "LARGE";

        Drink choice = Drink.valueOf(qty);
        switch (choice) {
            case Drink.SMALL:
                System.out.println("Small Del");
                break;

            case Drink.LARGE:
                System.out.println("Large Del");

                break;

            case Drink.XLARGE:
                System.out.println("XLarge Del");
                break;

            default:
                break;
        }

    }
}

class Drinkc {
    final int SMALL = 10;
    final int LARGE = 15;
    final int XLARGE = 25;

}

enum Drink {
    SMALL(10), LARGE(15), XLARGE(25);

    private int value;

    Drink(int v) {
        value = v;
    }

    public String toString() {
        return value + "";
    }

    public int getValue() {
        return value;
    }
}