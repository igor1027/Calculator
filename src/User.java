public class User {

    String users;
    String pass;
    String[][] account;

    public User(String user, String pas) {
        this.users = user;
        this.pass = pas;
    }

    //    public static void user(){
//        String users;
//        String pass;
//        String[][] account = new String[500][500];
////        public boolean check(){
////            if((users.equals(account[0][0])) && (pass.equals(account[0][1])));
////        }
//    }
   public boolean check(){
        if((users.equals(account[0][0])) && (pass.equals(account[0][1])));
       return true;
   }
}
