package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;

public class rylansClass{
public TalonSRX motor1 = new TalonSRX(1);

    public void init(){
        motor1.set(TalonSRXControlMode.PercentOutput, 0.0);
    }
    public void go(){
        
    }

}