package org.firstinspires.ftc.teamcode.sandbox.alex.bot.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class AlexIntake {

    // Hardware Declaration
    private final DcMotorEx intakeMotor;

    // Power Constants
    private static final double INTAKE_POWER = 0.5;
    private static final double OUT_POWER = 0.3;

    // States
    public enum IntakeState {
        INTAKE_ON,
        OUTTAKE_ON,
        INTAKE_OFF
    }

    // Set Current State
    private IntakeState currentIntakeState = IntakeState.INTAKE_OFF;

    // Constructor (Initialization)
    public AlexIntake(HardwareMap hwMap) {
        intakeMotor = hwMap.get(DcMotorEx.class, "intake motor");

        intakeMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }
}
