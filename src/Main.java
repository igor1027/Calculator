import java.util.Arrays;
import java.util.Scanner;

public class Main extends Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую тебя дорогой");
        Menu menu = new Menu();
        Operation operation = new Operation();
        Memory memory = new Memory(new double[]{0,0,0,0,0});
        int a = 1;
        while (a == 1){
            double num1 = menu.vvod();
            operation.oper();
            operation.calc();
            System.out.println(Operation.result);
            memory.Mem();
            System.out.println(Arrays.toString(memory.getArr()));
            if (a == 1){
                System.out.println("Если хотите продолжить работу калькулятьра введите (1), если нет, то (0)");
                a = scanner.nextInt();
            }
        }
    }
}
