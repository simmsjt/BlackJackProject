package com.skilldistillery.cards.blackjack;

public class Card {
	private Rank rank;
	private Suit suit;
	
	public  Card(Rank r, Suit s) {
		this.rank = r;
		this.suit = s;
	}
	
	public Rank getRank() {
		return rank;
	}
		
	public Suit getSuit() {
		return suit;
	}
	
	@Override
	public String toString() {
		return (rank.getSymbol()  + "" + suit.getSymbol());
	}
	
}
