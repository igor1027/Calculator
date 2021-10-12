import java.util.Scanner;

public class Operation extends Menu {

    public static double result;
    public static char operation;
    public static char oper(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете операцию коротую хотите сделать: ");
        System.out.println("Суммировать значения +");
        System.out.println("Отнять значения -");
        System.out.println("Умножить значения *");
        System.out.println("Разделить значения /");
        char char1 = '+';
        char char2 = '-';
        char char3 = '/';
        char char4 = '*';
        char fddf = scanner.nextLine().charAt(0);
        if(fddf  == '+' || fddf == '-' || fddf == '/' || fddf =='*'){
            operation = fddf;
        }else {
            System.out.println("Ошибка ввода операции");
            scanner.next();
            operation = oper();
        }
        return operation;
    }
    public double calc(){
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = oper();
        }
        return result;

    }

}
