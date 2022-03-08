// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Tecbotlimelight;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class LimelightSeek extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  Drivetrain chassis;
  Tecbotlimelight limelight;

  
  public LimelightSeek(){

    chassis = Robot.getRobotContainer().getChassis();
    limelight = Robot.getRobotContainer().getTecbotlimelight();
    addRequirements(chassis, limelight);
  }
  /* public Tecbotlimelight(Tecbotlimelight limelight) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }*/

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double y = 0;
    double x;
    
    y = Math.abs((((limelight.getArea())/85)-1)*0.8);
    x = (limelight.getX())/27;
    chassis.driveTank(y, x);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    chassis.driveTank(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
