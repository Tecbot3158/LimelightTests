package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robotmap;
import frc.robot.resources.TecbotSpeedController;
import frc.robot.resources.TecbotSpeedController.TypeOfMotor;

public class Drivetrain extends SubsystemBase {

    //CANSparkMax rightMotorPort ;
    //CANSparkMax rightMotorPort1;
    //CANSparkMax leftMotorPort ;
    //CANSparkMax leftMotorPort1 ;


    TecbotSpeedController rightMotorPort ;
    TecbotSpeedController rightMotorPort1;//
    TecbotSpeedController leftMotorPort ;
    TecbotSpeedController leftMotorPort1 ;

    
public Drivetrain () 
{


    
     //rightMotorPort = new CANSparkMax(Robotmap.rightMotorPort, MotorType.kBrushless) ;
     //rightMotorPort1 = new CANSparkMax (Robotmap.rightMotorPort1, MotorType.kBrushless);
     //leftMotorPort = new CANSparkMax (Robotmap.leftMotorPort, MotorType. kBrushless);
     //leftMotorPort1 = new CANSparkMax (Robotmap.leftMotorPort1, MotorType. kBrushless);

     
     rightMotorPort = new TecbotSpeedController(Robotmap.rightMotorPort,  TypeOfMotor.TALON_SRX) ;
     rightMotorPort1 = new TecbotSpeedController (Robotmap.rightMotorPort1, TypeOfMotor.TALON_SRX);
     rightMotorPort.setInverted(true);
     rightMotorPort1.setInverted(true);


     leftMotorPort = new TecbotSpeedController (Robotmap.leftMotorPort, TypeOfMotor.TALON_SRX);
     leftMotorPort1 = new TecbotSpeedController (Robotmap.leftMotorPort1, TypeOfMotor.TALON_SRX);

     //leftMotorPort.isInverted();
     //leftMotorPort1.isInverted();

}
public void driveTank(double y, double x)
{
    // y -> speed
    // x -> turn

//    double leftSpeed = -y + x;
//    double rightSpeed = -y - x;

    

    double leftSpeed = -y + x;
    double rightSpeed = -y - x;

    leftMotorPort.set(leftSpeed);
    leftMotorPort1.set(leftSpeed);

    rightMotorPort.set(rightSpeed);
    rightMotorPort1.set(rightSpeed);

    
   // leftMotorPort.set(y);
   // leftMotorPort1.set(y);

   // rightMotorPort.set(x);
   // rightMotorPort1.set(x);


    //System.out.println("x is: " + x);    
    //System.out.println("y is: " + y);


} ;

}

