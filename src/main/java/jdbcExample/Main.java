package jdbcExample;

import jdbcExample.manager.UserManager;
import jdbcExample.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();

        try {
//            User user = new User("Aram", "Sukiasyan", "suaram@mail.ru","aram1995");
//            userManager.add(user);
//            System.out.println(user);
            List<User> allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }

            userManager.deleteUserById(4);
            allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
