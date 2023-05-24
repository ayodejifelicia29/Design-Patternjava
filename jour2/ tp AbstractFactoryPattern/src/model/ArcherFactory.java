package model;

public class ArcherFactory implements CharacterFactory{

	@Override
	public  Archer createCharacter(String nom, int att, int def) {
		return new Archer(nom, att, def);
	}

}
