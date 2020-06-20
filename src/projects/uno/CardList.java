package projects.uno;

public class CardList {
    private Card first;
    private int count;

    public int size() {
        return this.count;
    }

    public Card getFirst() {
        return this.first;
    }

    /*
     * Constructor
     * if all is true, it creates a complete deck of 40 cards,
     *                 4 colors, numbers from 0-9
     * if all is false, it just creates an empty list
     */
    public CardList(boolean all) {
        first = null;
        count = 0; // Will get incremented via the add methods
        if (all) {
            for (Card.Colors color : Card.Colors.values()) {
                for (int number = 0; number <= 9; number++) {
                    add(number, color);
                }
            }
        }
    }

    /*
     * traverse: is not actually used in the gui version of the program,
     * but it is useful while debugging the program
     */
    public void traverse() {
        Card curr = this.first;
        while (curr != null) {
            System.out.println(curr);
            curr = curr.getNext();
        }
    }

    /*
     * add: adds a card to the front of the list
     * given number and color
     */
    private void add(int number, Card.Colors color) {
        this.first = new Card(number, color, this.first);
        this.count++;
    }

    /*
     * add: adds a card to the front of the list
     * given a reference to the new card
     */
    private void add(Card card) {
        card.setNext(this.first);
        this.first = card;
        this.count++;
    }

    /*
     * countCards: Traverse the list and return the number of cards.
     *     When complex operations are done on a list, such as
     *     concatenation of lists, countCards is used to make sure that the
     *     number of cards is kept updated (just there because we are lazy
     *     and do not want to think about how to compute the new number
     *     of cards based on the original ones).
     */
    private int countCards() {
        int num = 0;
        Card curr = this.first;
        while (curr != null) {
            num++;
            curr = curr.getNext();
        }
        return num;
    }

    /*
     * Append a new list of cards "list" at the end of the current list (this)
     * Notice that it might be possible for this.first to be null
     */
    public void concatenateWith(CardList list) {
        if (this.first == null) {
            this.first = list.first;
        } else {
            Card curr = this.first;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(list.first);
        }
        this.count = this.countCards();
    }

    /*
     * moveTo: move the front card from this to the front of destination
     */
    public void moveTo(CardList destination) {
        if (this.first == null) {
            return;
        }
        Card next = this.first.getNext();
        Card movingCard = this.first;
        destination.add(movingCard);
        this.first = next;
        this.count--;
    }

    /*
     * moveTo: move the first num cards from this to the front of destination,
     * it can use the (CardList destination) method repeatedly
     */
    public void moveTo(int num, CardList destination) {
        for (int i = 0; i < num; ++i) {
            this.moveTo(destination);
        }
    }

    /*
     * moveTo: Given a Card x, it finds the card on this list and
     *         moves it to the front of the destination list.
     *
     */
    public boolean moveTo(Card x, CardList destination) {
        if (this.first == null) {
            return false;
        }
        Card curr = this.first;
        Card prev = null;
        while (curr != null) {
            if (curr.getNumber() == x.getNumber() && curr.getColor() == x.getColor()) {
                if (prev == null) {
                    this.first = this.first.getNext();
                } else {
                    prev.setNext(curr.getNext());
                }
                destination.add(curr);
                this.count--;
                return true;
            }
            prev = curr;
            curr = curr.getNext();
        }
        return false;
    }

    /*
     * shuffle: Easy way is to create two new empty lists,
     *          repeat split number of times: move the
     *          first card of this to the first list, and then
     *          the next one to the second list,
     *          finally, concatenate the two lists to this.
     */
    public void shuffle(int split) { // split is being used as an iterator for the whole process
        for (int i = 0; i < split; i++) {
            CardList left = new CardList(false);
            CardList right = new CardList(false);
            while (this.size() > 2) {
                this.moveTo(left);
                this.moveTo(right);
            }
            this.concatenateWith(left);
            this.concatenateWith(right);
        }
    }

    /*
     * search: return a card that matches either the number or color
     *         of the given card x.
     *         You must use the matches(false,x) method that you wrote for the
     *         Card class.
     */
    public Card search(final Card x) {
        Card curr = this.first;
        while (curr != null && !curr.matches(false, x)) {
            curr = curr.getNext();
        }
        return curr;
    }

    /*
     * getCard: returns a Card in this list that matches exactly
     *          (use matches(true,card) method in Card) the given card
     */
    public Card getCard(final Card card) {
        Card curr = this.first;
        while (curr != null && !curr.matches(true, card)) {
            curr = curr.getNext();
        }
        return curr;
    }
}