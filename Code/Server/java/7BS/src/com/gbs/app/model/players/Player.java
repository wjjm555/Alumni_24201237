package com.gbs.app.model.players;

import java.util.ArrayList;
import java.util.List;

import com.gbs.app.model.cards.model.Card;
import com.gbs.app.model.cards.model.EquipCard;
import com.gbs.app.model.cards.model.KitCard;

public class Player {
	private final Identity identity;
	private final String id;

	private List<Card> handBrand = new ArrayList<>();
	private List<EquipCard> equipmentBrand = new ArrayList<>();
	private List<KitCard> determineBrand = new ArrayList<>();

	private Role role;

	public Player(String id, Identity identity) {
		this.id = id;
		this.identity = identity;
	}

	public enum Stage {
		Prepare_Initiative, Determine_Initiative, Scratch_Initiative, Play_Initiative, Discard_Initiative, Finish_Initiative, Prepare_Passive, Determine_Passive, Scratch_Passive, Play_Passive, Discard_Passive, Finish_Passive
	}
 
	public enum Identity {
		Master, Loyal, Spy, Thief;

		public boolean equal(Identity identity) {
			return this.equals(identity);
		}
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public Identity getIdentity() {
		return identity;
	}

	public List<Card> getHandBrand() {
		return handBrand;
	}

	public List<EquipCard> getEquipmentBrand() {
		return equipmentBrand;
	}

	public List<KitCard> getDetermineBrand() {
		return determineBrand;
	}

	public void scratchCard() {

	}

	public void playCard() {

	}

	public void disCard() {

	}
}
