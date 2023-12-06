package IT_COURSE.JAVA_COURSE.Seminar.one;

//Задание №2
//Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1, 0], вывести максимальное количество подряд идущих 1.

public class Two {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        int count = 0;
        int max_count = 0;

        for (int i : arr) {
            if (i == 1) {
                count++;
            } else {
                count = 0;
            }

            if (max_count < count) {
                max_count = count;
            }
        }
        System.out.println("max_count " + max_count);

//----------------------------------------------------------------------------------------------------------------------------------------------------

                // или 

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 1) {
        //         count++;
        //     }
        //     else {
        //         count = 0;
        //     }
        //     if (max_count < count) {
        //         max_count = count;
        //     }
        // }
        // System.out.println("max_count " + max_count);
    }
}
