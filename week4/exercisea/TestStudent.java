package week4.exercisea;

import week4.exercisea.Student;

public class TestStudent {
    public static void main(String[] args) {
        String output="";

        Student s1 = new Student("Tim","Computing",new String[]{"Maths", "Java", "Web Dev", "Networking Basics"});
        Student s2 = new Student("Ita","Social Care",new String[]{"Intro to Social Care", "Caring for the Elderly", "Psychology"});
        Student s3 = new Student("Joe","Physics",new String[]{"Relativity", "Mechanics", "Hydrodynamics", "Statics", "Quantum Mechanics"});

        output+="Calling static method getCount() to determine the number of students in the college\n\nTotal students: " + Student.getCount();

        output+="\n\nDisplaying the state of the 3 student objects at this point\n\n" + s1.toString() + "\n\n" + s2.toString() + "\n\n" +
                s3.toString();

        Student.setCollege("Munster Technological University");

        output+="\n\nCalling static method getCollege() to alter the name to MTU\n\nDisplaying the three objects after change\n\n" + s1.toString() + "\n\n" + s2.toString()
                + "\n\n" + s3.toString();

        System.out.println(output);


    }
}
