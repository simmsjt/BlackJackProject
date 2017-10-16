package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJack {

	public Dealer dealer = new Dealer();
	public Player player = new Player(new Hand(), "Jake");
	public Scanner sc = new Scanner(System.in);

	public void start() {
		player.setTotalMoney(100);
		turn();
	}

	public void turn() {
		// start of turn_________________________
		boolean hit = false;
		player.addToHand(dealer.drawCard());
		player.addToHand(dealer.drawCard());
		dealer.addToHand(dealer.drawCard());
		dealer.addToHand(dealer.drawCard());
		System.out.print("The dealer has a:  ");
		dealer.printFirstCard();
		System.out.print("\nYou have ");
		player.getHand().printHand();
		if (player.getHandValue() == 21) {
			System.out.println("BLACKJACK");
		} else {
			hitOrStand();

		}
	}

	public void hitOrStand() {
		String input;
		System.out.println("Hit? y/n");
		input = sc.nextLine().toLowerCase();
		if (input.charAt(0) == 'y') {
		} else {
			System.out.println("Player Stands");
		}
	}

}
