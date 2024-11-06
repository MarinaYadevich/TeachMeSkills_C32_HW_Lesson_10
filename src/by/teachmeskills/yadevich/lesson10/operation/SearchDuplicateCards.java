package by.teachmeskills.yadevich.lesson10.operation;

import by.teachmeskills.yadevich.lesson10.model.client.Client;

public class SearchDuplicateCards {

    public static void searchDuplicateCards(Client client){
        int duplicate = 0;

        for (int i = 0; i < client.getCards().size(); i++) {
            for (int j = i + 1; j < client.getCards().size(); j++) {
                if (client.getCards().get(i).equals(client.getCards().get(j))) {
                    duplicate++;
                    break;
                }
            }
        }
        if (duplicate == 0) {
            System.out.println("The " + client + " has no identical cards");
        } else {
            System.out.println("The " + client + " has " + duplicate + " identical cards.");
        }
    }
}
