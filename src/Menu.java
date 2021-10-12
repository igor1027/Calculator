import java.util.Scanner;

public class Menu {
    /**
     * 1- меню отдельный класс
     * 2- хранение резульатов в мвссив, при перезаполнении массива, он перзаписывается с 0 элемента массива
     * 3-разотает пока пользователь не захочет выйти
     * 4*- реализовать регистрацию и авторизацию
     */

    public static double num1;
    public static double num2;
    public double vvod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши значения: ");
        if (scanner.hasNextInt()){
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }else{
            System.out.println("Вы допустили ошибку при вводе, повторите число ");
            scanner.next();
            num1 = vvod();
        }
        return num1;
    }
}
