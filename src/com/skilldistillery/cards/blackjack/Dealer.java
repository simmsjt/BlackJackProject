package com.skilldistillery.cards.blackjack;

public class Dealer {
	private Hand hand;
	private Deck deck;
	
	public Dealer() {
		giveDeck();
	}
	
	public void giveDeck() {
		deck = new Deck();
	}
	
	public void shuffle() {
		deck.shuffle();
	}
	
	public void newDeck() {
		deck = new Deck();
	}
	
	
	
	
	
	
	
	
}
