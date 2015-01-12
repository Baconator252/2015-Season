// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4311.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4311.Robot;
import org.usfirst.frc4311.subsystems.wheels;

/**
 * Class responsible for moving right
 */
public class  turnright extends Command {
	private Joystick joystick;
	private wheels w;
	// USB Port number where the joystick is plugged into
	// Change if Joystick is not plugged into port #1
	private static int JOYSTICK_PORT_NUMBER = 1;
    public turnright() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.wheels);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	joystick = new Joystick(JOYSTICK_PORT_NUMBER);
    	w = new wheels();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double val = joystick.getX();
    	w.setJaguar1(-1 * val);
    	w.setJaguar2(val);
    	w.setJaguar3(-1 * val);
    	w.setJaguar4(val);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
