package bg.tu_varna.sit.builder.outer;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        UserBuilder builder = new UserType1Builder("pesho", "pesho");
        director.constructUserType1(builder);
        User user = builder.getUser();

        System.out.println(user);
    }
}


