package bg.tu_varna.sit.builder.inner;

public class Application {
    public static void main(String[] args) {
        User user1 = new User.Builder("pesho", "pesho")
                .withFirstName("Pesho")
                .withLastName("Pesho")
                .withLocation("Peshevo")
                .build();

        User user2 = new User.Builder("pesho", "pesho")
                .build();

        User user3 = new User.Builder("pesho", "pesho")
                .withLocation("Peshevo")
                .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
