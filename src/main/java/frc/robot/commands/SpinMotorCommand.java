package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SingleMotor;

public class SpinMotorCommand extends CommandBase {

    private SingleMotor motor;

    public SpinMotorCommand(SingleMotor m) {
        motor = m;
        addRequirements(m);
    }

    @Override
    public void execute() {
        motor.spin(0.2);
    }
}
