package model;

public class WarriorFactory implements CharacterFactory{

	@Override
	public Warrior createCharacter(String nom, int att, int def) {
		return new Warrior(nom, att, def);
	}

}
