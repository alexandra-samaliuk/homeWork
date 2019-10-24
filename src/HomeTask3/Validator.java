package HomeTask3;

public class Validator {
    private String cardNumber;
    private String cardType;
    private String cardOwner;
    private String expiryDate;
    private int cardCVV;

    public Validator(String cardNumber, String cardType, String cardOwner, String expiryDate, int cardCVV) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.cardOwner = cardOwner;
        this.expiryDate = expiryDate;
        this.cardCVV = cardCVV;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void validate(String cardNumber, String cardType, String cardOwner, String expiryDate, int cardCVV) {
        if (cardNumber.matches("^[0-9]{4} [0-9]{4} [0-9]{4} [0-9]{4}")) {
            if (cardType == "visa" || cardType == "maestro") {
                if (cardOwner.matches("^[A-Z]{2,20} [A-Z]{2,20}")) {
                    if (expiryDate.matches("^(0[0-9]||1[0-2])/(19||[2-9][0-9])")) {
                        if (cardCVV > 99 && cardCVV < 1000) {
                            System.out.println("Card is valid");
                        } else {
                            System.out.println("CVV is not valid");
                        }
                    } else {
                        System.out.println("Expiry date is not valid");
                    }
                } else {
                    System.out.println("Card owner is not exist");
                }
            } else {
                System.out.println("Card type is not valid");
            }
        } else {
            System.out.println("Card Number is not valid");
        }
    }
}
