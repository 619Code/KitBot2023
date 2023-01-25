package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SingleMotor extends SubsystemBase {

    private CANSparkMax controller;

    public SingleMotor(int CANID) {
        controller = new CANSparkMax(CANID, MotorType.kBrushless);
        controller.restoreFactoryDefaults();
        controller.setIdleMode(IdleMode.kBrake);
    }

    public void spin(double speed) {
        controller.set(speed);
    }
    
}
