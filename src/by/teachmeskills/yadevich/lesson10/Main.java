package by.teachmeskills.yadevich.lesson10;

import by.teachmeskills.yadevich.lesson10.card.OperationCard;
import by.teachmeskills.yadevich.lesson10.client.Client;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Marina", "Yadevich","353735BH746");
        OperationCard.createAddCard(client1,234,457435,5000);
        OperationCard.createAddCard(client1,234,457435,5000);
        OperationCard.createAddCard(client1,266,457485,9000);
        OperationCard.createAddCard(client1,123,454835,2000);
        OperationCard.createAddCard(client1,123,454835,2000);

        OperationCard.displayCards(client1);
        OperationCard.showNumberDuplicateCards(client1);
    }
}
