package by.teachmeskills.yadevich.lesson10.card;

import java.util.Objects;

public class Card {
    private int cvv;
    private int cardNumber;
    private double amount;

    public Card(int cvv, int cardNumber, double amount) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && cardNumber == card.cardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }
}
