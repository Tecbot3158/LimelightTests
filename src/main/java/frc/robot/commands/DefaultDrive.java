// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;

public class DefaultDrive extends CommandBase {

  Drivetrain chassis;
  OI oix;

  /** Creates a new DefaultDrive. */
  public DefaultDrive() {
    // Use addRequirements() here to declare subsystem dependencies.
    chassis = Robot.getRobotContainer().getChassis();
    addRequirements(chassis);

    oix = Robot.getRobotContainer().getOi();

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double joystickx = oix.getPilot().getLeftAxisX();
    double joysticky = oix.getPilot().getTriggers();

    chassis.driveTank(joysticky, joystickx);

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
