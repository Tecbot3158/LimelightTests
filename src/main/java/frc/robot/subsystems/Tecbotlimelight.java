package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Tecbotlimelight extends SubsystemBase {

    NetworkTable table;
    NetworkTableEntry tx;

    public Tecbotlimelight() {

        table = NetworkTableInstance.getDefault().getTable("limelight");

    }

    public double getX(){
        tx = table.getEntry("tx");
        return tx.getDouble(0);
    }

    public void periodic() {

        tx = table.getEntry("tx");

        double x = tx.getDouble(0);

        SmartDashboard.putNumber("LimelightX", x);

    }
}