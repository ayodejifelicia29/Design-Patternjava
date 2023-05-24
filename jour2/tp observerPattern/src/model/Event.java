package model;

public class Event {
	
	private String titre;
	private String date;
	private String horaire;

	
	
	public Event(String titre, String date, String horaire) {
		super();
		this.titre = titre;
		this.date = date;
		this.horaire = horaire;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHoraire() {
		return horaire;
	}
	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}
	@Override
	public String toString() {
		return "Event [titre=" + titre + ", date=" + date + ", horaire=" + horaire + "]";
	}
	
}
