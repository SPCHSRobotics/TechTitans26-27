package org.firstinspires.ftc.teamcode.sandbox.harrison;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareDeviceCloseOnTearDown;
@Disabled
@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {

        int teamNumber = 12345;
        double moterSpeed = 0.75;
        boolean clawClosed = true;
        String techTitans = "Harrison Mai";
        int moterAngle = 90;
        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("moter speed", moterSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("Name", techTitans);
        telemetry.addData("moter angle", moterAngle);
    }

    @Override
    public void loop() {
        /*
        1. change the String varaible "name" to your own team name.
        2. create an int called "moterAngle" and stor an angle between 0-180.
        Display this in your init method.
         */
    }
}