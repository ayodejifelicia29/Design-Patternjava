package metier;

import modele.Projectile;
import modele.ProjectilePool;

public class App {

	public static void main(String[] args) {
		ProjectilePool listeProjectile = new ProjectilePool(2);
		
		Projectile projectile1 = listeProjectile.getProjectile("projectile 1");
		projectile1.fire();
		
		Projectile projectile2 = listeProjectile.getProjectile("projectile 2");
		projectile2.fire();
		listeProjectile.releaseProjectile(projectile1);
		
		Projectile projectile3 = listeProjectile.getProjectile("projectile 3");
		projectile3.fire();
		
		listeProjectile.releaseProjectile(projectile2);
		
		Projectile projectile4 = listeProjectile.getProjectile("projectile 4");
		projectile4.fire();
		
	}

}
