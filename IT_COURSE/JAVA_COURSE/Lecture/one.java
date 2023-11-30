package IT_COURSE.JAVA_COURSE.Lecture;

/**
 * one
 */
public class one {

    public static void main(String[] args) {
        int i = 900;
        String b = Integer.toString(i);
        System.out.println(getType(b));
        
    }
    static String getType(Object x){
        return x.getClass().getSimpleName();
    }
} 