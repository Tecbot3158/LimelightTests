// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Tecbotlimelight;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  Tecbotlimelight tecbotlimelight;
  Drivetrain chassis;
  OI oix;
  // The robot's subsystems and commands are defined here...

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {

    tecbotlimelight = new Tecbotlimelight();
    chassis = new Drivetrain();
    oix = new OI();
    // Configure the button bindings
    // configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
   * it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  public void configureButtonBindings() {

    oix.configureButtonBindings();
  }

  public Drivetrain getChassis() {
    return chassis;
  }

  public OI getOi() {
    return oix;
  }

  public Tecbotlimelight getTecbotlimelight(){
    return tecbotlimelight;
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}