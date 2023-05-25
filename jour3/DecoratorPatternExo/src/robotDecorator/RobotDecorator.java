package robotDecorator;

import robot.Robot;

public abstract class RobotDecorator implements Robot{
	protected Robot robotDecore;
	
	public RobotDecorator(Robot robot) {
		this.robotDecore = robot;
	}
	
	@Override
	public void effectuerTache(String tache) {
		robotDecore.effectuerTache(tache);
	}
}
