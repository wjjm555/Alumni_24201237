package com.gbs.app.model.cards.model;

public abstract class KitCard extends Card {
	private final KitType type;

	public KitCard(Suit suit, Count count, KitType type) {
		super(Card.Type.Kit, suit, count);
		this.type = type;
	}

	public enum KitType {
		Weapon, Shield, Mounts
	}

	public KitType getKitType() {
		return type;
	}
}
