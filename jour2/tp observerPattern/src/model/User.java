package model;

public class User extends Observer {

	private Subject sub;
	private String name;
	
	public User(String name, Subject sub) {
		this.name=name;
		this.sub=sub;
		sub.ajouter(this);
	}
	
	public void notifier(Event event) {
		System.out.println(name+" a été notifié de l'évenement "+event);
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
