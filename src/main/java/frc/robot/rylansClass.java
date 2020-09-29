package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import frc.robot.OperatorInterface;
import frc.robot.Buttons;
import frc.robot.Wiring;

public class rylansClass{
public TalonSRX motor1 = new TalonSRX(Wiring.motor1);
private OperatorInterface oi;

    public void init(OperatorInterface oP){
        oi = oP;
        motor1.set(TalonSRXControlMode.PercentOutput, 0.0);
    }
    public void go(){
        if(oi.pilot.getRawButton(Buttons.A)){
            motor1.set(TalonSRXControlMode.PercentOutput, 0.5);    
        }
        else{
            motor1.set(TalonSRXControlMode.PercentOutput, 0.);    

        }
    }

}