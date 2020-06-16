# Overview: UNO

The objective of UNO is to be the first player to get rid of all your cards. 

A deck with 80 cards, each card containing a number and a color is used. Colors are RED, YELLOW, GREEN, and BLUE, numbers are integers from 0 to 9. 

The deck is initially shuffled, 7 cards are given to each player, and one card is placed on a “game” pile (initially it only has only one card). 

Players take turns, starting with the human player. On your turn you must match a card from your hand (human deck) to the card on top (front) of the “game” pile either by number or color. If you have such a card, you must click on it to throw it on top of the “game” pile. This card now becomes the card that your opponent will try to match. 

EXAMPLE: If the card on the “game” pile is red 7 (7R), you must throw a red card OR a card of any color with a number 7. 

If the player does not have a matching card, the player must take a card from the “deck” by clicking on the “deck” button. You must keep taking cards until you get a card that matches. If at some point you have more than 7 cards on your “hand” then you can use the left/right arrows (“<”, “>”) to see your other cards (you can only see 7 cards at a time). 

If the “deck” is almost depleted, the “game” pile will be reshuffled and added to the “deck” so that the game can continue (this is done automatically when the “deck” has 5 cards or less). 

The game ends once a player has no cards. The player with no cards wins.

 

## Objective

The purpose of this project is to make a functioning UNO game using Linked List data structures and OOP. 

### Example methods:

### In Card.java: 

​		public boolean matches(boolean exact,Card card) 

### In CardList.java: 

​		public void traverse() private void add(int number,Card.Colors color) 

​		private void add(Card card) private int countCards() public void concatenateWith(CardList list) 

​		public void moveTo(CardList destination) 

​		public void moveTo(int num,CardList destination) 

​		public boolean moveTo(Card x,CardList destination) 

​		public void shuffle(int split) 

​		public Card search(Card x) 

​		public Card getCard(Card card)