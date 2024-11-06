package by.teachmeskills.yadevich.lesson10.model.client;

import by.teachmeskills.yadevich.lesson10.model.card.Card;

import java.util.ArrayList;

public class Client {
    private final String name;
    private final String surname;
    private final ArrayList<Card> cards;
    private final String passportNumber;

    public Client(String name, String surname, String passportNumber) {
        this.name = name;
        this.surname = surname;
        this.cards = new ArrayList<>();
        this.passportNumber = passportNumber;
    }

    public void addCard(Card newCard){
        cards.add(newCard);
    }
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
}
