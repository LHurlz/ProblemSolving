package week5.exercisea;

public class Class {
    private String name;
    private String location;
    private int enrollment;
    private week5.exercisea.Time startTime;
    private week5.exercisea.Time finishTime;


    public Class(String name, String location, int enrollment, week5.exercisea.Time startTime, Time finishTime){
        setName(name);
        setLocation(location);
        setEnrollment(enrollment);
        setStartTime(startTime);
        setFinishTime(finishTime);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public void setStartTime(week5.exercisea.Time startTime) {
        this.startTime = new week5.exercisea.Time(startTime.getHour(), startTime.getMinute(), startTime.getSecond());
    }

    public void setFinishTime(week5.exercisea.Time finishTime) {
        this.finishTime = new week5.exercisea.Time(finishTime.getHour(), finishTime.getMinute(), finishTime.getSecond());
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public week5.exercisea.Time getStartTime() {
        return new week5.exercisea.Time(startTime.getHour(), startTime.getMinute(), startTime.getSecond());
    }

    public week5.exercisea.Time getFinishTime() {
        return new week5.exercisea.Time(finishTime.getHour(), finishTime.getMinute(), finishTime.getSecond());
    }

    public String toString(){
        return "Name: "+getName()+"\nLocation: "+getLocation()+"\nEnrollment: "+getEnrollment()+"\nStart Time: "+getStartTime()+"\nFinish Time: "
                +getFinishTime();
    }
}
