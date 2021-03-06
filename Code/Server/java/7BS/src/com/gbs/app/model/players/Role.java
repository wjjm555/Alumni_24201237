package com.gbs.app.model.players;

import java.util.ArrayList;
import java.util.List;

import com.gbs.app.model.Base;
import com.gbs.app.model.skills.model.Skill;

public class Role extends Base {

	private final Group group;
	private final Gender gender;

	private int bloodupper;
	private int blood;

	private List<Skill> skills = new ArrayList<>();

	public Role(Group group, Gender gender, int blood) {
		this.group = group;
		this.gender = gender;
		this.bloodupper = blood;
		this.blood = blood;
	}

	public Group getGroup() {
		return group;
	}

	public Gender getGender() {
		return gender;
	}

	public int getBloodupper() {
		return bloodupper;
	}

	public int getBlood() {
		return blood;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void addSkill(Skill skill) {
		skills.add(skill);
	}

	public enum Gender {
		Male, Female;
	}

	public enum Group {
		S, A, B, C, D;
	}

}
