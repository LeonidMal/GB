package IT_COURSE.JAVA_COURSE.Seminar.one;

// Задание №5 (доп)
// Во фразе "Welcome to the Java course" переставить слова в обратном порядке.

public class Five {
    public static void main(String[] args) {
        String phrase =  "Welcome to the Java course";
        arr(phrase);
    }
    static String[] arr(String str) {
        String[] arr_words = str.split(" ");
        for (int i = arr_words.length - 1; i > -1 ; i--) {      // для вывода массива в обратном порядке нужно начать перебор споследнего 
            System.out.print(arr_words[i] + " ");               // элемента, пока индекс больше -1
        }
    return arr_words;
        } 
}
