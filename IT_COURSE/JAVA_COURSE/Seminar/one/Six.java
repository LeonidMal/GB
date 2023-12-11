package IT_COURSE.JAVA_COURSE.Seminar.one;

import java.util.Scanner;

// Задание №6 (доп)
// Реализовать функцию возведения числа а в степень b. a, b из Z.
// Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:\n");
        int a = scan.nextInt();
        System.out.println("Enter a degree:");
        int b = scan.nextInt();
        System.out.println(pow_num(a, b));
        scan.close();
    }
    static double pow_num(double num1, int num2) {
        
        if (num1 == 1 || num2 ==0) {
            return 1;
        }

        double fin_num = 1;
        if (num2 < 0) {
            num2 = -num2;               // * чтобы возвести число в отрицательную степень, перед умножением числа самого на себя можно изначально
            num1 = 1.0 / num1;          //   поделить 1.0 на данное число(double), а у степени поменять знак!
        }
        for (int i = 0; i < num2; i++) {
            fin_num *= num1;
        }
        return fin_num;
        
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------
            // или

        // System.out.printf("answer: %.2f", pow_num(a, b));
    // }
    // static double pow_num(int num1, int num2) {
    //     double fin_num = 1;
    //     if (num2 > 0) {
    //         for (int i = 0; i < num2; i++) {
    //             fin_num *= num1;
    //         }
    //     } else if (num2 < 0) {
    //         for (int i = 0; i < -num2; i++) {
    //             fin_num *= num1;
    //         }
    //         fin_num = 1 / fin_num;
    //     } else {
    //         fin_num = 1;
    //     }
    // return fin_num;
}
