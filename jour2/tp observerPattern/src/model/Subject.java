package model;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> list = new ArrayList<Observer>();
	
	public Subject ajouter(Observer ob) {
		list.add(ob);
		System.out.println(ob+" a bien été ajouté à la liste des observers.");
		return this;
	}
	
	public Subject supprimer(Observer ob) {
		if (list.contains(ob)) {
			list.remove(ob);
			System.out.println(ob+" a bien été supprimé de la liste des observers.");
		} else {
			System.out.println(ob+" n'existe pas dans la liste des observers et n'a pas pu être supprimé.");
		}
		return this;
	}
	
	public Subject notifierAll(Event event) {
		for (Observer ob : list) {
			ob.notifier(event);
		}
		return this;
	}
	
}
