package org.usfirst.frc.team1797.robot.commands;

import org.usfirst.frc.team1797.robot.Robot;
import org.usfirst.frc.team1797.robot.subsystems.PistonSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ExtendPistonB extends Command {

    public ExtendPistonB() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(Robot.PISTON_SUBSYSTEM);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		Robot.PISTON_SUBSYSTEM.forwardPistonB();	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (System.currentTimeMillis() - Robot.PISTON_SUBSYSTEM.getLastActuation()) >= 1000;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
