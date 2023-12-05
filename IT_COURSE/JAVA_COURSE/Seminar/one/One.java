package IT_COURSE.JAVA_COURSE.Seminar.one;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

// Задание №1+
// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = scan.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (5 <= hour && hour < 12) System.out.printf("Good morning, %s!", name);
        else if (12 <= hour && hour < 18) System.out.printf("Good afternoon, %s!", name);
        else if (18 <= hour && hour < 23) System.out.printf("Good evening, %s!", name);
        else System.out.printf("Good night, %s!", name);
        scan.close();
    }
}
