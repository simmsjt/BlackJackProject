package com.skilldistillery.cards.blackjack;

public class BlackJack {
	
	public static Dealer dealer = new Dealer();
	public static Player player = new Player(new Hand(), "Jake");
	
	public void start (){
		playBlackJack();
		System.out.println("");
	}
	
	public static void playBlackJack() {
		boolean hit = false;
		player.getHand().addCard(new Card(Rank.KING,Suit.CLUBS));
		player.getHand().addCard(dealer.getDeck().drawCard());
		dealer.getHand().addCard(dealer.getDeck().drawCard());
		dealer.getHand().addCard(dealer.getDeck().drawCard());
		System.out.println("You have:  ");
		player.getHand().printHand();
//		System.out.println("You have ");
//		dealer.getHand().printHand();
		
	}
}
