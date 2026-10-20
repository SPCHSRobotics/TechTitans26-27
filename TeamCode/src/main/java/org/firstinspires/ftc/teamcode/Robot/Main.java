package org.firstinspires.ftc.teamcode.Robot;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;



//Bellow here is the code that we run on the robot
@TeleOp(name="Human Drives", group="Linear OpMode")
public class Main extends LinearOpMode {
    //Initialize the hardware listed bellow:
    public DcMotor intake;
    public void InitializeHardware(){
        intake = hardwareMap.get(DcMotor.class, "intake");
        intake.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void PowerIntake(DcMotor intakeMotor){
        intakeMotor.setPower`(1);
    }



    @Override
    public void runOpMode() {
        InitializeHardware();

        while (opModeIsActive()) {
            PowerIntake(intake);
        }
    }
}

