package by.teachmeskills.yadevich.lesson10.client;

import by.teachmeskills.yadevich.lesson10.card.Card;

import java.util.ArrayList;

public class Client {
    private String name;
    private String surname;
    private ArrayList<Card> cards;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.cards = new ArrayList<Card>();
    }

    public void addCard(int cvv, int cardNumber, double amount) {
        Card newCard = new Card(cvv, cardNumber, amount);
        cards.add(newCard);
    }

    public void displayCards() {
        if (cards.isEmpty()) {
            System.out.println("The client has no cards.");
            return;
        }
        System.out.println("Client info: \n" + name + " " + surname);
        System.out.println("Client cards: ");
        for (Card card : cards) {
            System.out.println("Card number: " + card.getCardNumber() +
                    ", cvv: " + card.getCvv() +
                    ", amount: " + card.getAmount());
        }
    }

    public void showNumberDuplicateCards(){
        int duplicate = 0;
        for(int i = 0; i < cards.size(); i++){
            for(int j = i + 1; j < cards.size(); j++){
                if(cards.get(i).equals(cards.get(j))){
                    duplicate++;
                    break;
                }
            }
        }
        if(duplicate == 0){
            System.out.println("The client has no duplicates.");
        }else{
            System.out.println("The client has " + duplicate + " duplicates.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
