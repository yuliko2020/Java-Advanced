package lesson_6hw_18_1;


/**
 * JavaAdvanced
 * 09/07/2020
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Oleg", "oleg25", "dfjkö12");
        User user2 = new User("Nataly", "nataly25", "dfjkö25");
        User user3 = new User("Sergei", "sergei35", "dfjkö35");

        User[] users = new User[]{
                user1,
                user2,
                user3,
                new User("Hose ", "hose25", "daier25"),
                new User("Sveta", "sveta003", "fsjfkfi01"),
                new User("Nataly", "nataly25", "dfjkö25")

        };
        System.out.println(" Find te same users : " + findSameUsers(users));
        System.out.println(" Find users  index : " + findUser(users, user1));
        sayHi(users, user2.getLogin(), user2.getPassword());

    }

    //поиск одинаковых пользователей
    private static boolean findSameUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (i != j && users[i].equals(users[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    //принимает пользователя , отдаёт индекс --- почему не отдаёт правильно юзер 2 и т.д???
    private static int findUser(User[] users, User user) {
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                index = i;
            }
        }
        return index;
    }

    //приветствие
    private static void sayHi(User[] users, String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                System.out.println("User : " + user.getName() + " you are welcome ");
            }
        }
    }
}

