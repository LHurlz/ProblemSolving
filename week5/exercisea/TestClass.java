package week5.exercisea;

public class TestClass {
    public static void main(String[] args) {
        String output="";

        Class c1 = new Class("Yoga for Beginners","Community Centre, Ballyheigue",23,new Time(19,30,0),new Time(20,45,0));
        Class c2 = new Class("Intermediate Zumba","Caherciveen SS Sports Hall",18,new Time(18,45,0),new Time(19,30,0));
        Class c3 = new Class("OOP","S306",22,new Time(9,0,0),new Time(11,0,0));

        Class[] allClasses = {c1,c2,c3};

        output+="Displaying the state of the 3 class objects\n\n";

        for(int i=0; i<allClasses.length; i++){
            output+="Class " + (i+1) + "\n\n" + allClasses[i].toString()+"\n\n";
        }

        c3.setStartTime(new Time(11,60,-12));
        c3.setFinishTime(new Time(-2,58,61));

        output+="\n\nTrying to set start and finish times of OOP class to dodgy values.\n\nThe state of the OOP class is now\n\n" + c3.toString();

        Time yogaStartTime = new Time(19,45,0);

        c1.setStartTime(yogaStartTime);

        output+="Trying to set start time of the Yoga class to 19:45 using referenced Time object.\n\nThe state of the Yoga class is now\n\n" + c1.toString();

        yogaStartTime.setHour(18);
        yogaStartTime.setMinute(50);
        yogaStartTime.setSecond(0);

        output+="\n\nChanging yogaStartTime to 18:50\nThe state of yogaStartTime is now " + yogaStartTime.toString()+"\n\nThe state of the Yoga Class is now\n\n"
                + c1.toString();

        System.out.println(output);


    }
}
