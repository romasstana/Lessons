import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLDataException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
//        int a = 0;
//        int b = 7/a;
//        System.out.println(b);
//
//        try { // 1 Обертка блока кода, где возможно появление исключения;
//            int a = 0;
//            int b = 2 / a;
//        } catch (ArithmeticException e) { // 2 Обработка исключения;
//            System.out.println(e); // 3 Вывод ошибки;
//        }
//        System.out.println("awdawdawdwdawdawd");

//        try {
//            int a = 0;
//            int b = 2 / a;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        Ramazan ramazan = new Ramazan();
        ramazan.setAge(22);
        ramazan.setHeight(185);
        Object human = ramazan;
        System.out.println(human.getClass());
//        try {
//            throw new MyException(1); // 4  Вызов исключения - экземпляра исключения MyException;
//        } catch (MyException e) { // 5  Обработка исключения;
//            System.out.println(e); // Exception Number =  1
//        } finally {
//            System.out.println(1213123123);
//        }
    }
}