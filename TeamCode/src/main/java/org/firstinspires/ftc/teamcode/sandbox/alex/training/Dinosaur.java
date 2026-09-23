package org.firstinspires.ftc.teamcode.sandbox.alex.training;

public class Dinosaur {

    // Variables
    int heightInFeet;
    static double RUNNING_SPEED; // in mph
    int weightInPounds;

    // Constructor
    public Dinosaur(int heightInFeet, int weightInPounds) {
        this.heightInFeet = heightInFeet;
        this.weightInPounds = weightInPounds;
    }

    // Methods
    public void increaseHeight(int heightChange) {
        heightInFeet = getHeight() + heightChange;
    }

    public int getHeight() {
        return heightInFeet;
    }

}
