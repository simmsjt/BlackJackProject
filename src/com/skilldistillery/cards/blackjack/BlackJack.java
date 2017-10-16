package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJack {

	public Dealer dealer = new Dealer();
	public Player player = new Player(new Hand(), "Jake");
	public Scanner sc = new Scanner(System.in);

	public void start() {
		player.setTotalMoney(100);
		newTurn();
		player.addToHand(dealer.drawCard());
		player.addToHand(dealer.drawCard());
		dealer.addToHand(dealer.drawCard());
		dealer.addToHand(dealer.drawCard());
		turn();
	}

	public void newTurn() {
		dealer.clearHand();
		player.clearHand();
		if (dealer.getDeck().getNumberOfCards() < 13) {
			dealer.newDeck();
		}
	}

	public void turn() {
		// start of turn_________________________
		boolean hit = false;

		System.out.print("The dealer has a:  ");
		dealer.printFirstCard();
		System.out.print("\nYou have ");
		player.getHand().printHand();
		hitOrStand();
			

		}
	

	public void hitOrStand() {
		String input;
		if (player.getHandValue() == 21) {
			// condition for blackjack
			System.out.println("BLACKJACK YOU WIN!!");
		} else if (player.getHandValue() > 21) {
			System.out.println("YOU BUSTED FOO!");
		} else {
			System.out.println("\nHit? y/n");
			input = sc.nextLine().toLowerCase();
			if (input.charAt(0) == 'y') {
				player.addToHand(dealer.drawCard());
				System.out.print("\nYou have ");
				player.getHand().printHand();
				hitOrStand();
			} else {
				System.out.println("Player Stands");
			}
		}
	}

}
