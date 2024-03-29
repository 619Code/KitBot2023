package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public final class Constants {
    //Drive CANs
    public static final int LEFT_LEADER = 6;
    public static final int RIGHT_LEADER = 8;
    public static final int LEFT_FOLLOWER = 12; //!!!
    public static final int RIGHT_FOLLOWER = 7;
    
    //Positions
    public static final int VERTICAL_POSITION = 0;
    public static final int FRONT_POSITION = 1;
    public static final int TURRET_SWITCH = 3;


    //Aiming PID
    public static final double AIMING_P = 0.12; //0.15
    public static final double AIMING_I = 0.00; //0.02
    public static final double AIMING_D = 0.005; //0.01

    //Drive constants
    public static final double WHEEL_DIAMETER = Units.inchesToMeters(5.827); //meters
    public static final int NEO_LIMIT = 45; //amps
    public static final double SPEED_ADJUST = 0.4; //how much to adjust speed of drive //0.5 //UNDO
    public static final double DRIVE_RATIO_HIGH = (10.0/66.0) * (40.0/44.0); // gear ratio for high gear
    public static final double DRIVE_RATIO_LOW = (10.0/66.0) * (24.0/60.0); // gear ratio for low gear
    public static final double TRACK_WIDTH = Units.inchesToMeters(23); //distance between wheels in meters
    public static final String SHUFFLEBOARD_DRIVE_TAB_NAME = "Drive";
    public static final double RPM_TO_VELOCITY_CONVERSION_FACTOR = WHEEL_DIAMETER * Math.PI / 60; //conversion factor for rpm to velocity

    //Drive solenoids
    public static final int PCM_CAN_ID = 0;
    public static final int DRIVE_SOLENOID_FORWARD = 0;
    public static final int DRIVE_SOLENOID_BACK = 7;

    //Controller constants
    public static final double JOYSTICK_DEADZONE = 0.075; //0.075;


    // Kinematics/Auto Constants
    public static final double ksVolts = 0.34791;
    public static final double kvVoltSecondsPerMeter = 0.27259;
    public static final double kaVoltSecondsSquaredPerMeter = 0.060902;

    public static final double kPDriveVel = 0.38794;
    public static final DifferentialDriveKinematics kDriveKinematics =
        new DifferentialDriveKinematics(TRACK_WIDTH);

    public static final double kMaxSpeedMetersPerSecond = 0.5;
    public static final double kMaxAccelerationMetersPerSecondSquared = 1;

    public static final double kRamseteB = 2;
    //public static final double kRamseteZeta = 0.7;

    //public static boolean kLeftEncoderReversed = false;

    // Shot finding constants
    //public static final double GRAVITY = 9.81; // m/s^2
}