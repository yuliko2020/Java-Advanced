package lesson07_user;

/**
 * JavaAdvanced
 * 09/07/2020
 */
public class UserArray {
    User[] users;

    public UserArray(User[] users) {
        this.users = users;
    }
    public  boolean findDublUsers(){
        for (int i = 0; i <users.length ; i++) {
            for (int j = i+1; j <users.length ; j++) {
                if (users[i].equals(users[j])){
                    return true;
                }
            }
        }
        return false;
    }

    public  void helloUser(String login,String pass){
        for (int i = 0; i <users.length ; i++) {
           String Login = users[i].getLogin();
            String uLogin = users[i].getLogin();
            String uPass = users[i].getPass();
            if (uLogin.equals(login)&&uPass.equals(pass)){
                System.out.println("Hello "+users[i].getName());
                return;
            }

        }
        System.out.println("no user ");
    }

}
