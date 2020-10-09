package week3.exercisea;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){
        this(1,1,1900);
    }

    public Date(int day,int month,int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day){
        this.day=day;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public void setYear(int year){
        this.year=year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public boolean equals(Date d){
        return (d.day==day && d.month==month && d.year==year);
    }

    public Date copy(){
        //Date d3 = new Date(date.getDay(),);
       // d3.setDay(date.getDay());
       // d3.setMonth(this.month=month);
       // d3.setYear(this.year=year);

        return new Date(getDay(),getMonth(),getYear());
    }

    public String toString(){
        return day + "-" + month + "-" + year;
    }
}
