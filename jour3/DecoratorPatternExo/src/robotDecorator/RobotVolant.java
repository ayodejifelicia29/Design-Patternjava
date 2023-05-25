package robotDecorator;

import robot.Robot;

public class RobotVolant extends RobotDecorator {

	public RobotVolant(Robot robot) {
		super(robot);
	}
	
	public void voler() {
		System.out.println("Je suis un robot qui a appris à voler");
	}

	@Override
	public void effectuerTache(String tache) {
		//System.out.print("De manière aerienne, ");
		voler();
		robotDecore.effectuerTache(tache);
	}
}
