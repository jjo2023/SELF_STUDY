package TheEssenceOfJava;

public class Ch06_3_Q {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = 4;


    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
