package Exe01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Card implements Comparable<Card> {

    // string representations of ranks
    /*
    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
    };
     */
    public static final String[] RANKS = {
        null, "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen"
    };

    // string representations of suits
    /*
    public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
    };
     */
    public static final String[] SUITS = {
        "one star", "two star", "three star", "four star"
    };

    // rank ont suit are instance variable
    private final int rank;
    private final int suit;

    // constructs a card of the given rank and suit.
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    @Override
    public int compareTo(Card that) {
        // 인스턴스 suit가 parameter suit보다 작다면 -1 리턴
        if(this.suit < that.suit) {
            return -1;
        }
        // 인스턴스 suit가 파라미터 suit보다 크다면 1 리턴
        if(this.suit > that.suit) {
            return 1;
        }
        // 인스턴스 rank가 파라미터 rank보다 작다면 -1 리턴
        if(this.rank < that.rank) {
            return -1;
        }
        // 인스턴스 rank가 파라미터 rank보다 크다면 1 리턴
        if(this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    // 만약 인스턴스 rank, suit와 파라미터 rank, suit가 같다면 true, 아니면 false.
    public  boolean equal(Card that) {
        return this.rank == that.rank
                && this.suit == that.suit;
    }

    // 52개의 카드가 담긴 리스트를 만든다.
    public static List<Card> makeDeck() {
        List<Card> cards = new ArrayList<Card>();
        // 0부터 3보다 같거나 작을 때까지, 즉 4번동안 반복문 실행
        for(int suit = 0; suit <= 3; suit++) {
            // 1부터 13보다 같거나 작을 때까지, 즉 13번동안 반복문 실행
            // 4 * 13, 52가 된다.
            for(int rank = 1; rank <= 13; rank++) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
        return cards;
    }

    public static void main(String[] args) throws Exception {

        // 자연정렬을 통해 카드들을 정렬한다.
        List<Card> cards = makeDeck();
        Collections.sort(cards);

        System.out.println(cards.get(0));
        System.out.println(cards.get(51));
        System.out.println(cards);

        Comparator<Card> comparator = new Comparator<Card>() {

            private int getRankAceHigh(Card card) {
                int rank = card.getRank();
                if(rank == 1) {
                    return 14;
                } else {
                    return rank;
                }
            }

            @Override
            public int compare(Card card1, Card card2) {

                if(card1.getSuit() < card2.getSuit()) {
                    return 1;
                }
                if(card1.getSuit() > card2.getSuit()) {
                    return 1;
                }

                /*
                int rank1 = getRankAceHigh(card1);
                int rank2 = getRankAceHigh(card2);

                if(rank1 < rank2) {
                    return -1;
                }
                if(rank1 > rank2) {
                    return 1;
                }

                 */

                return 0;
            }
        };

        Collections.sort(cards, comparator);
        System.out.println(cards.get(0));
        System.out.println(cards.get(51));
        System.out.println(cards);

    }

}
