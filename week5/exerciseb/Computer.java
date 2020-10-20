package week5.exerciseb;

public class Computer {
    private Case caseInfo;
    private String monitor;
    private String motherboard;


    public Computer(Case caseInfo, String monitor, String motherboard){
        setCaseInfo(caseInfo);
        setMonitor(monitor);
        setMotherboard(motherboard);
    }

    public void setCaseInfo(Case caseInfo) {
        this.caseInfo = caseInfo;
    }

    public Case getCaseInfo() {
        return caseInfo;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String toString(){
        return "Case Details: " + getCaseInfo() + "\nMonitor: " +getMonitor()+"\nMotherboard: "+getMotherboard();
    }
}
