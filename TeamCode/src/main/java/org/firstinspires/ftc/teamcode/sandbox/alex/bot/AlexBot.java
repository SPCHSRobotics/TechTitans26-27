package org.firstinspires.ftc.teamcode.sandbox.alex.bot;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.sandbox.alex.bot.subsystems.AlexDriveTrain;

public class AlexBot {
    // Subsystems
    public final AlexDriveTrain driveTrain;

    // Constructor passes hwMap into subsystems
    public AlexBot(HardwareMap hwMap) {
        driveTrain = new AlexDriveTrain(hwMap);
    }

    // Update the bot
    public void update() {
        driveTrain.update();
    }
}
