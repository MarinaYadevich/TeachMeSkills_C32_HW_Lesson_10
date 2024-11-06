package by.teachmeskills.yadevich.lesson10.operation;

import by.teachmeskills.yadevich.lesson10.model.card.Card;
import by.teachmeskills.yadevich.lesson10.model.client.Client;

public class OperationCard {

    public static void createAddCard(Client client, int cvv, int cardNumber, double amount) {
        Card newCard = new Card(cvv, cardNumber, amount);
        client.addCard(newCard);
    }
    public static void displayCards(Client client) {
        if (client.getCards().isEmpty()) {
            System.out.println("The " + client + " has no cards.");
            return;
        }
        System.out.println(client + " info: \n" + "passport number - " + client.getPassportNumber() + ".");
        System.out.println(client + " cards: ");
        for (Card card : client.getCards()) {
            System.out.println("Card number: " + card.getCardNumber() +
                    ", cvv: " + card.getCvv() +
                    ", amount: " + card.getAmount());
        }
    }
    public static void showNumberDuplicateCards(Client client){
        if (client.getCards() == null) {
            throw new NullPointerException("Client cards list is null");
        }else if(client.getCards().isEmpty()){
            System.out.println("Empty map list.");
        }else if(client.getCards().size() == 1){
            System.out.println("The client has only one card.");
        }else {
            SearchDuplicateCards.searchDuplicateCards(client);
        }
    }
}