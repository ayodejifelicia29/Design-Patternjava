package metier;

import robot.Robot;
import robot.RobotBasique;
import robotDecorator.RobotNettoyeur;
import robotDecorator.RobotVolant;

public class App {

	public static void main(String[] args) {
		Robot myRobot = new RobotBasique();
		myRobot.effectuerTache("faire du café pour les développeurs Java !");

		Robot robotAmeliore = new RobotVolant(myRobot);
		//robotAmeliore.voler();
		robotAmeliore.effectuerTache("livrer les courses");
		
		Robot robotMultiTache = new RobotNettoyeur(robotAmeliore);
		//robotMultiTache.nettoyer();
		robotMultiTache.effectuerTache("faire la vaisselle");
		robotMultiTache.effectuerTache("planter des tomates");
		
	}

}
