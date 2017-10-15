package com.skilldistillery.cards.blackjack;

public enum Suit {
    HEARTS('\u2665'),
    SPADES('\u2660'),
    CLUBS('\u2663'), 
    DIAMONDS('\u2666');
    
	public final char symbol;
	
	private Suit(char symbol) {
		this.symbol = symbol;
	}
   
	
	public char getSymbol() {
		return symbol;
	}
	
	
    
    

}

