package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.LimelightSeek;
import frc.robot.resources.TecbotController;
import frc.robot.resources.TecbotController.ButtonType;
import frc.robot.resources.TecbotController.TypeOfController;

public class OI {
    TecbotController pilot;

    public OI() {

        pilot = new TecbotController(0, TypeOfController.PS4);

    }

    public TecbotController getPilot() {

        return pilot;
    }

    public void configureButtonBindings() {
        pilot.getButton(ButtonType.X).whileHeld(new LimelightSeek());
    }

}
