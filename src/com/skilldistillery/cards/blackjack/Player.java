package com.skilldistillery.cards.blackjack;

public class Player {
	
	private Hand hand;
	private String name;
	private int totalMoney;
	
	
	
	public Player() {
		setTotalMoney(0);
	}
	
	
	public Player(String name) {
		setName(name);
		setTotalMoney(0);
	}
	
	
	public Player(Hand hand) {
		setHand(hand);
		setTotalMoney(0);
	}
	
	public Player(Hand hand, String name) {
		setName(name);
		setHand(hand);
		setTotalMoney(0);
	}
	
	

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
}
