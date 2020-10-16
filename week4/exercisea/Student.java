package week4.exercisea;

import java.util.Arrays;

public class Student {
    private String name;
    private int id;
    private static String college="Institute of Technology, Tralee";
    private String dept;
    private String[] modules;
    private static int count=0;

    public Student(String name, String dept, String[] modules){
        count++;
        setId(count);
        setName(name);
        setDept(dept);
        setModules(modules);
        }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static String getCollege() {
        return college;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public String[] getModules() {
        return modules;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return "Student " + getId() + "\n\nName: " + getName() + "\nID: " + getId() + "\nCollege: " + getCollege() +
                "\nDepartment: " + getDept() + "\nModules: " + Arrays.toString(modules);
    }
}
