package IT_COURSE.JAVA_COURSE.Seminar.one;

import java.util.Arrays;

// Задание №3
// Дан массив nums = [3,2,5,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

public class Three {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 3, 8, 12, 3, 5, 3 };
        int val = 3;
        System.out.println(Arrays.toString(sort(nums, val)));
    }

    static int[] sort(int[] arr, int num) {
        int[] final_arr = new int[arr.length];
        int index_val = arr.length - 1;
        int index = 0;
        for (int item : arr) {                              // создал метод, перебирающий массив и подставляющий нужный элемент(val) в конец нового
            if (item == num) {                              // массива, а не нужные элементы по порядку в начало нового массива
                final_arr[index_val] = item;
                index_val--;
            } else {
                final_arr[index] = item;
                index++;
            }
        }
        return final_arr;
    }
}
