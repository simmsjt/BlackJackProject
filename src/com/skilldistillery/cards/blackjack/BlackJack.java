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
	}
	public void turn() {
		// start of turn_________________________
		boolean hit = false;
		
		System.out.print("The dealer has a:  ");
		dealer.printFirstCard();
		System.out.print("\nYou have ");
		player.getHand().printHand();
		if (player.getHandValue() == 21) {
			//condition for blackjack
			System.out.println("BLACKJACK");
		} else {
			if(player.getHand().getValue()<21){
			//condition for play
			hitOrStand();
			} else {
			//conditon for busting
				System.out.println("YOU BUSTED FOO!");
			}
			
			
		}
	}

	public void hitOrStand() {
		String input;
		System.out.println("\nHit? y/n");
		input = sc.nextLine().toLowerCase();
		if (input.charAt(0) == 'y') {
			player.addToHand(dealer.drawCard());
		} else {
			System.out.println("Player Stands");
		}
	}


}
