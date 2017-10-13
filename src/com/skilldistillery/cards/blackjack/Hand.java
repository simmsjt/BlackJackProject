package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List <Card> hand;
	
	public Hand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
}
