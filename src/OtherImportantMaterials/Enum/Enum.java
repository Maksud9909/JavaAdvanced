package OtherImportantMaterials.Enum;

public class Enum {

}


enum WeekDays {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}

class Today{
    WeekDays weekDay;
    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }
    void dayInfo(){
        switch (weekDay){
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("Go to work");
                break;
            case Sunday:
            case Saturday:
                System.out.println("Have a rest");
                break;
        }
    }

    public static void main(String[] args) {
        Today today = new Today(WeekDays.Monday);
        today.dayInfo();
    }
}
