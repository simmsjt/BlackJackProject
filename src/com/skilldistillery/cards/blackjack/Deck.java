package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck;

	public Deck() {
		generateDeck();
		shuffle();
	}

	public Deck(List<Card> deck) {
		this.deck = deck;
	}
	
	
	private void generateDeck() {
		deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
	}
	
	public Card drawCard() {
		return deck.remove(0);
	}
	
	public void addCard(Card c) {
		deck.add(c);
	}
	
	public void printCards(){
		for (int x = 0; x < deck.size(); x++) {
			System.out.println(deck.get(x).getRank() + " of " + deck.get(x).getSuit());
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	

}
