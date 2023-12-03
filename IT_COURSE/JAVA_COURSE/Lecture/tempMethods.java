package IT_COURSE.JAVA_COURSE.Lecture;

public class tempMethods {

    static String getType(Object x){                          //Узнать тип переменной
        return x.getClass().getSimpleName();
    }
}
