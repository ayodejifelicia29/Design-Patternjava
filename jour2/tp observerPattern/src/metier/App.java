package metier;

import model.Event;
import model.Subject;
import model.User;

public class App {

	public static void main(String[] args) {
		Subject mySubject = new Subject();

		User user1 = new User("user1", mySubject);
		User user2 = new User("user2",mySubject);
		User user3 = new User("user3",mySubject);
		User user4 = new User("user4",mySubject);
		
		
		Event event1 = new Event("Rock en Seine", "12 juin 2025", "20h-5h" );
		mySubject.notifierAll(event1);
		Event event2 = new Event("Balade en forêt", "26 juin 2025", "15h-18h" );
		mySubject.notifierAll(event2);
		Event event3 = new Event("Musée du Louvre", "21 novembre 2025", "9h-12h" );
		mySubject.notifierAll(event3);
	}

}
