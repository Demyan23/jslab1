package lab1;

public class Main {
    public static void main(String[] args) {

        CreditCard firstcreditCard = new CreditCard();
        CreditCard secondcreditCard = new CreditCard("Gold", 1.111111111111111, "dollar");
        CreditCard thirdcreditCard = new CreditCard("Premium", 2.2222222222222222, "euro", 3, "Bob");


        System.out.println(firstcreditCard);
        System.out.println(secondcreditCard);
        System.out.println(thirdcreditCard);

        System.out.println();
        System.out.println(CreditCard.staticField());
    }
}

