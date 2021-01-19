package belhard.batura.homeTask2;

public class Birthday {

    public static void main(String[] args) {
        int year = 1993;
        int month = 11;
        int day = 3;
        int sum = year + month + day;
        boolean monthBiggerDay = month > day;
        double myAge = 27;
        double partYear = 2.0 / 12.0;
        char[] myName = {'A', 'r', 't', 'e', 'm'};
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);
        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
        for (int i = 0; i < 5; i++)
            System.out.print(myName[i]);
        System.out.println();
        System.out.printf("Мне %.2f лет", myAge + partYear);
    }
}
