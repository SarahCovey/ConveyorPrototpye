package org.usfirst.frc.team1797.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PistonSubsystem extends Subsystem {
	
	private DoubleSolenoid pistonA;
	private DoubleSolenoid pistonB;
	
	private long lastActuation;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public PistonSubsystem() {
		// They should have different channels as they are supposed to be synchronous.
		pistonA = new DoubleSolenoid(0, 1);
		pistonB = new DoubleSolenoid(1, 2);
		lastActuation = Long.MAX_VALUE;
	}
	
	public void forwardPistonA() {
		pistonA.set(DoubleSolenoid.Value.kForward);
		lastActuation = System.currentTimeMillis();
	}
	
	public void reversePistonA() {
		// They should have the same reverse channels as they are supposed to be in sync.
		// use command groups so they are together
		pistonA.set(DoubleSolenoid.Value.kReverse);
		lastActuation = System.currentTimeMillis();
	}
	
	public void forwardPistonB() {
		pistonA.set(DoubleSolenoid.Value.kForward);
		lastActuation = System.currentTimeMillis();
	}
	
	public void reversePistonB() {
		// They should have the same reverse channels as they are supposed to be in sync.
		// use command groups so they are together
		pistonA.set(DoubleSolenoid.Value.kReverse);
		lastActuation = System.currentTimeMillis();
	}
	
	public void stopAll() {
		pistonA.set(DoubleSolenoid.Value.kOff);
		pistonB.set(DoubleSolenoid.Value.kOff);
		lastActuation = Long.MAX_VALUE;
	}
    
    public long getLastActuation() {
		return lastActuation;
    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}