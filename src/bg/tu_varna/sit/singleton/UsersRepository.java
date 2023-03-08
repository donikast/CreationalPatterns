package bg.tu_varna.sit.singleton;

import java.util.HashSet;
import java.util.Set;

public class UsersRepository {

    private static UsersRepository singletonInstance;
    private Set<User> users = new HashSet<>();

    private UsersRepository() {}

    public static UsersRepository getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new UsersRepository();
        }
        return singletonInstance;
    }

    public boolean addUser(User user) {
        return users.add(user);
    }
}
