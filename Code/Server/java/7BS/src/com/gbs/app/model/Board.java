package com.gbs.app.model;

import java.util.ArrayList;
import java.util.Random;

import com.gbs.app.model.cards.model.Card;

/***
 * ju
 * 
 * @author jianmingchen
 *
 */
public class Board {
	public final int cardsCount = 50;

	private Random random = new Random();
	private ArrayList<Card> allCards = new ArrayList<>(cardsCount);
	private ArrayList<Card> standardCards;

	public Board() {
		initBoard();

	}

	@SuppressWarnings("unchecked")
	private void shuffle() {
		standardCards = (ArrayList<Card>) allCards.clone();
	}

	private void initBoard() {
		// TODO
		shuffle();
	}

	private void startGame() {

	}

	private class GameThread extends Thread {
		@Override
		public void run() {
			while (true) {
				int index = random.nextInt(standardCards.size());
				Card card = standardCards.remove(index);
			}
		}
	}

}
