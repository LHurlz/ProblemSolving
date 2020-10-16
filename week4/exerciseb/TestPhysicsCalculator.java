package week4.exerciseb;

public class TestPhysicsCalculator {
    public static void main(String[] args) {
        String output="";

        output+="Calling energyFromMass() to determine energy that is equivalent to a mass 1.3 nanograms\n\n" + "Energy equivalent of " +
                "1.3 nanograms is " + PhysicsCalculator.energyFromMass(1.3E-9) + " Joules";

        output+="\n\nCalling method energyFromFrequency.\n\nEnergy equivalent to 345.87 teraHertz is " + PhysicsCalculator.energyFromFrequency(345.87E12)
                +" Joules";

        output+="\n\nCalling method coulombForce()\n\nForce between the two charges is " + PhysicsCalculator.coulombForce(4.58E-6,-38.56E-6,0.528) + " Newtons";

        System.out.println(output);
    }
}
