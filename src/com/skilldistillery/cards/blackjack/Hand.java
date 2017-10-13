package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> hand;

	public Hand(ArrayList<Card> hand) {
		this.hand = hand;
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

	public void printHand() {
		for (int x = 0; x < hand.size(); x++) {
			System.out.println(hand.get(x).getRank() + " of " + hand.get(x).getSuit());
		}
	}

}
