package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Tecbotlimelight extends SubsystemBase {

    NetworkTable table;
    NetworkTableEntry tx;
    NetworkTableEntry ta;
    NetworkTableEntry ty;
    NetworkTableEntry ts;
    NetworkTableEntry tv;

    public Tecbotlimelight() {

        table = NetworkTableInstance.getDefault().getTable("limelight");

    }

    public boolean getValidTargets(){
        tv = table.getEntry("tv");
        if(tv.getDouble(0)==1) return true;
        else return false;
    }

    public double getX(){
        tx = table.getEntry("tx");
        return tx.getDouble(0);
    }

    public double getY(){
        ty = table.getEntry("ty");
        return ty.getDouble(0);
    }

    public double getSkew(){
        ts = table.getEntry("ts");
        return ts.getDouble(0);
    }

    public double getArea(){
        ta = table.getEntry("ta");
        return ta.getDouble(0);
    }


    public void periodic() {

        double tv = table.getEntry("tv").getDouble(0);
        double tx = table.getEntry("tx").getDouble(0);
        double ty = table.getEntry("ty").getDouble(0);
        double ts = table.getEntry("ts").getDouble(0);
        double ta = table.getEntry("ta").getDouble(0);

        SmartDashboard.putNumber("LimelightX", tv);
        SmartDashboard.putNumber("LimelightX", tx);
        SmartDashboard.putNumber("LimelightX", ty);
        SmartDashboard.putNumber("LimelightX", ts);
        SmartDashboard.putNumber("LimelightX", ta);

    }
}