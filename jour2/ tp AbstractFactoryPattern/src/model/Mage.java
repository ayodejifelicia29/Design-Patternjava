/**
 * 
 */
package model;

public class Mage implements Character{
	
	private String nom;
	
	private int attMagie;
	
	private int defMagie;

	public Mage(String nom, int attMagie, int defMagie) {
		this.nom = nom;
		this.attMagie = attMagie;
		this.defMagie = defMagie;
		System.out.println(this+" vient d'être créé");
	}

	@Override
	public String toString() {
		return "Mage [nom=" + nom + ", attMagie=" + attMagie + ", defMagie=" + defMagie + "]";
	}

	@Override
	public void attack() {
		System.out.println("Le mage "+nom+" attaque avec une boule de feu et fait "+attMagie+" points de dégats magiques.");
		
	}

	@Override
	public void defend() {
		System.out.println("Le mage "+nom+" se défend avec son bouclier magique et réduit ses dégats de "+defMagie+" points.");
	}
	
}
