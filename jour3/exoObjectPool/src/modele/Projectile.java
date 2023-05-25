package modele;

public class Projectile {
	
	private int id;

	public void fire() {
		System.out.println("Le projectile est tiré! id : " + id);
	}

	public Projectile(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Projectile [id=" + id + "]";
	}
	
}
