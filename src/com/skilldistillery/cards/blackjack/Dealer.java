package com.skilldistillery.cards.blackjack;

public class Dealer {
	private Hand hand;
	private Deck deck;
	
	public Dealer() {
		newDeck();
		deck.shuffle();
		setHand(new Hand());
	}
	
	public void giveDeck(Deck deck) {
		this.deck = deck;
	}
	
	public void shuffle() {
		deck.shuffle();
	}
	
	public void newDeck() {
		deck = new Deck();
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public void addHand(Card c) {
		hand.addCard(c);
	}
	
	public void clearHand() {
		hand = new Hand();
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	
	
}
