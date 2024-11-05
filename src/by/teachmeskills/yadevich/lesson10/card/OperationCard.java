package by.teachmeskills.yadevich.lesson10.card;

import by.teachmeskills.yadevich.lesson10.client.Client;

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
        int duplicate = 0;
        for(int i = 0; i < client.getCards().size(); i++){
            for(int j = i + 1; j < client.getCards().size(); j++){
                if(client.getCards().get(i).equals(client.getCards().get(j))){
                    duplicate++;
                    break;
                }
            }
        }
        if(duplicate == 0){
            System.out.println("The " + client + " has no identical cards");
        }else{
            System.out.println("The " + client + " has " + duplicate + " identical cards.");
        }
    }
}