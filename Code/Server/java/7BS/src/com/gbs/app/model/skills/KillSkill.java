package com.gbs.app.model.skills;

import com.gbs.app.model.players.Player;
import com.gbs.app.model.skills.model.Skill;

public class KillSkill extends Skill {

	public KillSkill() {
		super(Skill.Type.Common, Skill.Mode.Initiative);
	}

	@Override
	public Object execute(Player... players) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object judge(Player... players) {
		// TODO Auto-generated method stub
		return null;
	}

}
