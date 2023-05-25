package modele;

import java.util.ArrayList;

public class ProjectilePool {

	
	ArrayList<Projectile> listeProjectile;
	private int maxPoolSize = 5;
	 private int id = 1;
	
	public ProjectilePool() {
		initialize();
	}
	
	public ProjectilePool(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
		initialize();
	}
	
	public Projectile getProjectile(String thread) {

        if (listeProjectile.isEmpty()) {
            Projectile projectile = createProjectile();
            System.out.println(thread + " a cree " + projectile);
            return projectile;
        }

        System.out.println(thread + " reutilise un projectile libre");
        return listeProjectile.remove(listeProjectile.size() - 1);
    }
	
	public void releaseProjectile(Projectile projectile) {
        if (listeProjectile.size() < maxPoolSize)
            listeProjectile.add(projectile);

        System.out.println("libere " + projectile);
    }
	
	
	
	
	private Projectile createProjectile() {

		return new Projectile(id++);
	}

	private void initialize() {
		listeProjectile = new ArrayList<>();
		
	}


	public Projectile getProjectile(){
		return null;
	}
}
