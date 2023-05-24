package metier;



//import model.Archer;
import model.ArcherFactory;
import model.CharacterFactory;
import model.Character;

public class App {

	public static void main(String[] args) {
		CharacterFactory factory = new ArcherFactory();
		Character robin = factory.createCharacter("Robin Hood", 25, 12);
		robin.attack();
		robin.defend();
		
		
	}

}
