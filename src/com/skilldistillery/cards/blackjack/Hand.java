package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> hand;

	public Hand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	public Hand() {
		hand = new ArrayList<Card>();
	}

	public List<Card> getHand() {
		return hand;
	}

	public void addCard(Card c) {
		hand.add(c);
	}

	public void clearHand() {
		hand.clear();
	}
	
	public int getValue() {
		int totalValue = 0;
		for (int x = 0; x < hand.size(); x++) {
			totalValue += hand.get(0).getRank().getValue();
		}
		return totalValue;	
	}
	
	public void printHand() {
		for(int i= 0; i < hand.size(); i++) {
			System.out.print(hand.get(i) + " ");
		}
	}

}
