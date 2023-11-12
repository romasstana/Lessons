//Декларация MyException, который расширяет класс Exception;
public class MyException extends Exception{
    int a;

    MyException(int b) { // 2 Объявление конструктора;
        a = b;
    }

    public String toString() { // 3  Переопределение метода toString();
        return ("Exception Number =  " + a);
    }
}
