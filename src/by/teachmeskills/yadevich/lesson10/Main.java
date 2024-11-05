package by.teachmeskills.yadevich.lesson10;

import by.teachmeskills.yadevich.lesson10.client.Client;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Marina", "Yadevich");
        client1.addCard(348, 5476456, 6000);
        client1.addCard(345,5476456, 4000 );
        client1.addCard(485,056347, 2000);
        client1.addCard(485,056347, 2000);


        client1.displayCards();
        client1.showNumberDuplicateCards();
    }
}
