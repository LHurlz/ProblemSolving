package week4.exerciseb;

public class PhysicsCalculator {
    private static int SPEED_OF_LIGHT = 299792458;
    private static double PLANCK_CONSTANT = 6.62607004*(Math.pow(10,-34));
    private static double PERMITTIVITY_OF_VACUUM = 8.8542*(Math.pow(10,-12));

    public PhysicsCalculator(){

    }

    public static double energyFromMass(double mass){
        double result = mass*(Math.pow(SPEED_OF_LIGHT,2));

        return result;
    }

    public static double energyFromFrequency(double frequency){
        double result = PLANCK_CONSTANT*frequency;

        return result;
    }

    public static double coulombForce(double q1, double q2, double distance){
        double result = (q1*q2)/(4*Math.PI*PERMITTIVITY_OF_VACUUM*(Math.pow(distance,2)));

        return result;
    }

}
