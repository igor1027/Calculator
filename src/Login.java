import java.util.Scanner;

public class Login {

    public void register(){
        Scanner scanner = new Scanner(System.in);
        String login;
        String password;
        int a = 1;

        System.out.println("Если хотите зарагестрироваться введите (1), если нет, то (0)");
        a = scanner.nextInt();
        while (a == 1){
            System.out.println("Придумайте логин: ");
            login = scanner.nextLine();
            System.out.println("Придумайте пароль: ");
            password = scanner.nextLine();
        }
        System.out.println("Войдите в свой аккаунт");
        System.out.println("Введите логин: ");
        login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        password = scanner.nextLine();

        User user = new User(login, password);
        if (user.check());
        System.out.println();
    }

//    public void user(){
//        String users;
//        String pass;
//        String[][] account = new String[500][500];
//        public boolean check(){
//            if((users.equals(account[0][0])) && (pass.equals(account[0][1])));
//        }
//
//    }
}
