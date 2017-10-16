package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJack {

	public Dealer dealer = new Dealer();
	public Player player = new Player(new Hand(), "Jake");
	public Scanner sc = new Scanner(System.in);

	public void start() {
		player.setTotalMoney(100);
		newTurn();
		turn();
	}

	public void newTurn() {
		dealer.clearHand();
		player.clearHand();
		if (dealer.getDeck().getNumberOfCards() < 13) {
			dealer.newDeck();
			System.out.println("Dealer changed to a new deck");
		}
		player.addToHand(dealer.drawCard());
		player.addToHand(dealer.drawCard());
		dealer.addToHand(dealer.drawCard());
		dealer.addToHand(dealer.drawCard());
	}

	public void turn() {
		// start of turn_________________________
		boolean hit = false;

		System.out.print("The dealer has a: ");
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
			System.out.println("YOU BUSTED FOO! : " + player.getHandValue());
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
				System.out.print("\nYou have: ");
				player.getHand().printHand();
				System.out.print(" : " + player.getHandValue());
				dealersTurn();
				System.out.print("\nThe dealer has: ");
				dealer.getHand().printHand();
				System.out.print(" : " + dealer.handValue());
				if (dealer.handValue() > 21) {
					System.out.println("\nOh the dealer busted you win! Damn you're good");
				} else if (dealer.handValue() < player.getHandValue()) {
					System.out.println("\nOh you kicked that AI's virtual butt!!! Way to go!");
				} else if (dealer.handValue() > player.getHandValue()) {
					System.out.println("\nThe dealer beat you. This must be a huge disapointment.");
				} else if (dealer.handValue() == player.getHandValue()) {
					System.out.println("\nIt's a push dude...");
				}

			}
		}
	}

	public boolean dealersTurn() {
		// case after stand dealers turn

		if (dealer.handValue() < 16) {
			// dealer must draw
			dealer.addHand(dealer.drawCard());
			dealersTurn();
		}

		return true;

	}

}
