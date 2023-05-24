package model;

public class Warrior implements Character{
	
	private String nom;
	
	private int attPhysique;
	
	private int defPhysique;

	public Warrior(String nom, int attPhysique, int defPhysique) {
		this.nom = nom;
		this.attPhysique = attPhysique;
		this.defPhysique = defPhysique;
		System.out.println(this+" vient d'être créé");
	}

	@Override
	public void attack() {
		System.out.println("Le guerrier "+nom+" attaque avec son épée en acier de Damas et fait "+attPhysique+" points de dégats physiques.");
		
	}

	@Override
	public void defend() {
		System.out.println("Le guerrier "+nom+" se défend avec son bouclier en bronze et réduit ses dégats de "+defPhysique+" points.");
	}

	@Override
	public String toString() {
		return "Warrior [nom=" + nom + ", attPhysique=" + attPhysique + ", defPhysique=" + defPhysique + "]";
	}

}
