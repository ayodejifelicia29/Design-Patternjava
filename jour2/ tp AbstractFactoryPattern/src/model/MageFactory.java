package model;

public class MageFactory implements CharacterFactory {

	@Override
	public Mage createCharacter(String nom, int att, int def) {
		return new Mage(nom, att, def);
	}

}
