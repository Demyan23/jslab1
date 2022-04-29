package lab1;

public record CreditCard(String cardType,double number,String value,double duration,String owner) {

    private static String bank = "Bober";

    public CreditCard() {

        this("Premium", 1.111111111111111, "euro", 2, "bob");

    }
    public CreditCard(String cardType, double number, String value) {

        this(cardType, number, value, 2, "biba");

    }


    @Override
    public String toString() {

        return "creditCard : "
                + "Type = " + this.cardType + ", "
                + "number = " + this.number + ", "
                + "value = " + this.value + ", "
                + "duration = " + this.duration + ", "
                + "owner = " + this.owner + ", "
                + "bank = " + bank + ", "
                ;
    }

    public static String staticField() {
        return bank;
    }

}
