package robotDecorator;

import robot.Robot;

public class RobotNettoyeur extends RobotDecorator {

	public RobotNettoyeur(Robot robot) {
		super(robot);
	}

	public void nettoyer() {
		System.out.println("Je suis un robot qui a appris à nettoyer");
	}
	@Override
	public void effectuerTache(String tache) {
		//System.out.print("Sans aucune poussière, ");
		nettoyer();
		robotDecore.effectuerTache(tache);
	}
}
