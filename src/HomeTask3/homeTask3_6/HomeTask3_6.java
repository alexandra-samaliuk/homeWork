package HomeTask3.homeTask3_6;

public class HomeTask3_6 {
    public static void main(String[] args) {
        Validator card = new Validator("1111 1111 1111 1111", "visa", "IVAN IVANOV", "01/21", 123);
        card.validate(card.getCardNumber(), card.getCardType(), card.getCardOwner(), card.getExpiryDate(), card.getCardCVV());
    }
}
