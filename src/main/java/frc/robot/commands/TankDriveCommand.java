package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;

public class TankDriveCommand extends CommandBase {
    private Drivetrain drive;
    private XboxController controller;
    private double leftY, rightY;
    //@Log
    private double throttle;
    //@Log
    private double rotation;
    private boolean isLowGear;


    public TankDriveCommand(Drivetrain drive, XboxController controller) {
        this.drive = drive;
        this.controller = controller;
        addRequirements(drive);
    }

    @Override
    public void execute() {
        leftY = controller.getLeftY();
        rightY = controller.getRightY();

        //add deadzones :3c
        // if (leftY <= Constants.JOYSTICK_DEADZONE) {
        //     leftY = 0;
        // }
        // if ()


        setVals();
        //System.out.println("Speed: " + throttle);
        //System.out.println("Rotation: " + rotation);
        //drive.curve(throttle, rotation, isLowGear);
        drive.tankDriveVolts(leftY * 10, rightY * 10);
    }

    public void setVals() {
        throttle = (Math.abs(leftY) > Constants.JOYSTICK_DEADZONE) ? leftY : 0;
        throttle = -throttle;
        rotation = (Math.abs(rightY) > Constants.JOYSTICK_DEADZONE) ? rightY : 0;

        //
        System.out.println("Left Y = " + leftY + ", Right X = " + rightY);
        //

        if(controller.getRightTriggerAxis() > 0.5) { //UNDO
            throttle *= 0.5;
        }

        isLowGear = false;
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
