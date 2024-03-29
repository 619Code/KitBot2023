package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.SingleMotor;

public class DriveCommand extends CommandBase {
    private Drivetrain drive;
    private XboxController controller;
    private double leftY, rightX;
    //@Log
    private double throttle;
    //@Log
    private double rotation;
    private boolean isLowGear;


    public DriveCommand(Drivetrain drive, XboxController controller) {
        this.drive = drive;
        this.controller = controller;
        addRequirements(drive);
    }

    @Override
    public void execute() {
        leftY = controller.getLeftY();
        rightX = controller.getRightX() * 0.75;


        setVals();
        //System.out.println("Speed: " + throttle);
        //System.out.println("Rotation: " + rotation);
        drive.curve(throttle, rotation, isLowGear);
    }

    public void setVals() {

        if(controller.getRightTriggerAxis() > 0.5) { //UNDO
            leftY*= 0.5;
            //rightX *= 0.5;
        }

        throttle = (Math.abs(leftY) > Constants.JOYSTICK_DEADZONE) ? leftY : 0;
        throttle = -throttle;
        rotation = (Math.abs(rightX) > Constants.JOYSTICK_DEADZONE) ? rightX : 0;

        //
        System.out.println("Left Y = " + leftY + ", Right X = " + rightX);
        //

        //
        System.out.println("Left Y = " + leftY + ", Right X = " + rightX);
        //

        

        isLowGear = false;
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
