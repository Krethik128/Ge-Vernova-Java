package src.week1.strings.level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DeckOfCards {
    public static void main(String[] args) {
        List<String> deck = initializeDeck();
        Collections.shuffle(deck);
        int players = 4;
        int cardsPerPlayer = 5;
        distributeCards(deck, players, cardsPerPlayer);
    }

    public static List<String> initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }

    public static void distributeCards(List<String> deck, int players, int cardsPerPlayer) {
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(deck.remove(0));
            }
            System.out.println();
        }
    }
}
