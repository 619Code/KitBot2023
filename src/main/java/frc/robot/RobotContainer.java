package frc.robot;

import frc.robot.Constants;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.SpinMotorCommand;
import frc.robot.commands.TankDriveCommand;
import frc.robot.helpers.Crashboard;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.SingleMotor;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {


	private XboxController driver;
	private DriveCommand driveCommand;
	private TankDriveCommand tank;
	private Drivetrain drive;
	private boolean tankDrive;

	public RobotContainer() {
		tankDrive = false; //Crashboard.snagBoolean("Tank Drive");
		driver = new XboxController(0);

        drive = new Drivetrain();
        driveCommand = new DriveCommand(drive, driver);
		tank = new TankDriveCommand(drive, driver);
		
		if (!tankDrive)
        drive.setDefaultCommand(driveCommand);
		else drive.setDefaultCommand(tank);
		// motor = new SingleMotor(10);
		// motor.setDefaultCommand(new SpinMotorCommand(motor));
		configureBindings();
	}

	private void configureBindings() {

	}

	public Command getAutonomousCommand() {
		return null;
	}
}