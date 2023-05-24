package model;

public class Archer implements Character {
	
private String nom;
	
	private int attPhysique;
	
	private int exquivePhysique;

	public Archer(String nom, int attPhysique, int exquivePhysique) {
		this.nom = nom;
		this.attPhysique = attPhysique;
		this.exquivePhysique = exquivePhysique;
		System.out.println(this+" vient d'être créé");
	}

	@Override
	public String toString() {
		return "Archer [nom=" + nom + ", attPhysique=" + attPhysique + ", exquivePhysique=" + exquivePhysique + "]";
	}

	@Override
	public void attack() {
		System.out.println("L'archer "+nom+" attaque à distance avec son arc et fait "+attPhysique+" points de dégats phsysiques.");
		
	}

	@Override
	public void defend() {
		System.out.println("L'archer "+nom+" exquive une partie de l'attaque et réduit ses dégats de "+exquivePhysique+" points.");
	}
}
