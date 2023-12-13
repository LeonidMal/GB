package IT_COURSE.JAVA_COURSE.Lecture;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import IT_COURSE.JAVA_COURSE.Lecture.tempMethods;
import java.io.*;

public class one {
    
    public static void main(String[] args) throws Exception {
        
        // int i = 5;                                   //в начале данного файла импортирован созданный ранее мной файл с методами (tempMethods.java), 
        // String b = "dsf";                            //в коде слева я обращаюсь к заранее прописанному методу "getType()" из файла tempMethods.java
        // System.out.println(tempMethods.getType(i));
        // System.out.println(tempMethods.getType(b));

//----------------------------------------------------------------------------------------------------------------------------------------------------

        // int[] arr[] = new int[3][5];                                //объявление и вывод двумерного массива
        // for (int[] line : arr) {
        //     for (int item : line) {
        //         System.out.printf("%d ", item);
        //     }
        //     System.out.println();
        // }

//----------------------------------------------------------------------------------------------------------------------------------------------------

        // int[][] arr = new int[3][5];                                //объявление и вывод двумерного масиива
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("%d ", arr[i][j]);
        //     }
        //     System.out.println();
        // }

//----------------------------------------------------------------------------------------------------------------------------------------------------

        // Scanner iScanner = new Scanner(System.in);                  //получение примитивов из терминала
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.println(x);
        // System.out.printf("double b: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

//-------------------------------------------------**ФОРМАТИРОВАННЫЙ ВЫВОД**--------------------------------------------------------------------------
            

        // int a = 1;
        // int b = 8;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.println(res);
        
        // int a = 1;
        // int b = 8;
        // int c = a + b;
        // System.out.printf("%d + %d = %d \n", a, b, c);

        // int a = 1;
        // int b = 8;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res); 

//---------------------------------------------**ОБЛАСТЬ ВИДИМОСТИ ПЕРЕМЕННЫХ**-----------------------------------------------------------------------
            

        // int a = 111;                         <---  
        //                                         |
        // {                                       |  приведёт к ошибке программы  
        //     int a = 222;                      __|
        //     System.out.println(a);           __
        // }                                      |
        //                                        | разрешено, Выводом будет: 222
        // int a = 333;                           |                           333
        // System.out.println(a);              <---

            // если переменную объявили внутри некоторого блока фигурных скобок {} (a = 222),
            // то снаружи этого блока переменная будет недоступна!

//-------------------------------------------------**СНИППЕТЫ FOREACH/FORI**----------------------------------------------------------------------------
      

        // int[] arr = new int[] {1, 2, 3, 4, 8};                      // <--- сниппет foreach, подходит для перебора элементов коллекции
        // for (int i : arr) {                                         // НЕ ПОЗВОЛЯЕТ вносить изменения в коллекцию
        //     System.out.printf(" %d", i);                            // Вывод: 1 2 3 4 8
        // }

//---------------------------------------------------------------------------------

        // for (int i = 0; i < arr.length; i++) {                      // <--- сниппет fori, перебор элементов коллекции по индексу
        //     arr[i] += 10;                                           // ПОЗВОЛЯЕТ вносить изменения в коллекцию
        // }
        // for (int i : arr) {                                         // вывод коллекции с помощью сниппета foreach
        //     System.out.printf(" %d", i);                            // Вывод: 11 12 13 14 18
        // }

//--------------------------------------------------**РАБОТА С ФАЙЛАМИ**--------------------------------------------------------------------------------
        

        //                                    библиотека import java.io.File;

            // *Создание и запись\дозапись*

        // try (FileWriter fw = new FileWriter("new_file.txt", false)) {   // "false" перезаписывает, а "true" дозаписывает файл
        //     fw.write("line 1");                                                         
        //     fw.append('\n');                                        // *требуется импортировать библиотеки import java.io.FileWriter;
        //     fw.append('2');                                         //                                   и import java.io.IOException;
        //     fw.append('\n');
        //     fw.write("line 3");
        //     fw.flush();                                             // метод ".flush()" выгружает данные из буфера в поток, (осыобождая кэш)
        // } catch (IOException ex) {
        //     System.out.println(ex.getMessage());                    // конструкция "try - catch" c "IOException" используется для обработки и
        // }                                                           // вывода ошибок (например: файл только для чтения, а не редактирования)

//---------------------------------------------------------------------------------

            // *Чтение файла (посимвольно)*                            // *требуется дописать в точке входа (main) "throws Exception"

        // FileReader fr = new FileReader("new_file.txt");             // *требуется импортировать библиотеку import java.io.FileReader;
        // int c;
        // while ((c = fr.read()) != -1) {                             // метод ".read()" возвращает значение -1 при достижении конца файла
        //     char ch = (char) c;
        //     if (ch == '\n') System.out.print(ch);
        //     else System.out.print(ch); 
        // }

//---------------------------------------------------------------------------------

            // *Чтение файла (построчно)*                              // *требуется дописать в точке входа (main) "throws Exception"

        // BufferedReader br = new BufferedReader(new FileReader("new_file.txt"));  // *требуется импортировать библиотеку import java.io.FileReader;
        // String str;                                                                                                   и import java.io.BufferedReader;
        // while ((str = br.readLine()) != null) {                  
        //     System.out.printf("== %s ==\n", str);                   // метод ".readLine()" возвращает значение null при достижении конца файла
        // }
        // br.close();                                                 // метод ".close()" закрывает поток и освобождает ресурсы, которые были заняты в потоке

//----------------------------------------------------------------------------------------------------------------------------------------------------

                // *Д\З*

        // Задана натуральная степень k. Сформировать случайным
        // образом список коэффициентов (значения от 0 до 100)
        // многочлена многочлен степени k.
        // *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x²

        // Scanner scan = new Scanner(System.in);
        // Random rnd = new Random();
        // String x = "x";

        // System.out.println("Enter the value of the natural degree:");
        // int k = scan.nextInt();

        // int degree = k;
        // for (int i = 0; i < k - 1; i++) {
        //     int r = rnd.nextInt(101);
        //     if (r > 1) System.out.printf("%d * x^%d", r, degree);
        //     else if (r == 1) System.out.printf("x^%d", degree);
        //     degree--;
        //     if (degree > 0 && r != 0) System.out.printf(" + ");
        // }

        // int r = rnd.nextInt( 101);
        // if (r > 1) System.out.printf("%d * x", r);
        // else if (r == 1) System.out.print("x");
        
        // int rEnd = rnd.nextInt(101);
        // if (rEnd >= 1) System.out.printf(" + %d", rEnd);

        // System.out.print(" = 0\n\n");
        // scan.close();

//----------------------------------------------------------------------------------------------------------------------------------------------------

        // Даны два файла, в каждом из которых находится запись
        //многочлена. Сформировать файл содержащий сумму
        //многочленов.

        try (FileWriter fw = new FileWriter("polin_1.txt", false)) {
            fw.write("8 * x^2 + 15 * x + 6 = 0");
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter fw = new FileWriter("polin_2.txt", false)) {
            fw.write("35 * x^2 + 2 * x + 14 = 0");
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
} 