package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month < 1){
            System.out.println("wrong number!");
        } else if (month == 2) {
            System.out.println("28");
        } else {
            switch (month){
                case 1, 3, 5, 7,8,10,12 :
                    System.out.println("31");
                    break;
                default:
                    System.out.println("30");
                    break;
            }
        }
    }
}

/*
Implement the program that will consume a number month
from method argument and print amount of days in that month,
if number is not a month number -> print: "wrong number!":
 */