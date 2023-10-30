package OtherImportantMaterials.Enum;

import java.util.Arrays;

public class Enum {

}


enum WeekDays {
    Monday("Bad"),
    Tuesday("Bad"),
    Wednesday("So-so"),
    Thursday("So-so"),
    Friday("Good"),
    Saturday("Great"),
    Sunday("Super");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return "the mood for today is " +  mood;
    }
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
                System.out.println("Go to work it is " + weekDay);
                break;
            case Sunday:
            case Saturday:
                System.out.println("Have a rest");
        }
        System.out.println(weekDay.getMood());
    }

    public static void main(String[] args) {
        Today today = new Today(WeekDays.Friday);
        today.dayInfo();

       WeekDays w1 = WeekDays.valueOf("Monday");
        System.out.println(w1);
        WeekDays [] weekDays = WeekDays.values();
        Arrays.stream(weekDays).forEach(weekDays1 -> System.out.println(weekDays1));
    }
}
