public class MyDate {
    int month;
    int day;
    int year;
    MyDate date;
    //empty constructor
    MyDate(){}

    public MyDate(int month, int day, int year) {
        this.month=month;
        this.day=day;
        this.year=year;
    }

    public void setDate(int month, int day, int year)
    {

    this.month=month;
    this.day=day;
    this.year=year;


    }

    public MyDate getDate(){

       return date;
    }


    public String toString(){
        return month+"/"+day+"/"+year;
    }
    public String toString(String s){
        return "";
    }
}
