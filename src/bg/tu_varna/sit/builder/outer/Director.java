package bg.tu_varna.sit.builder.outer;

public class Director {

    public void constructUserType1(UserBuilder builder) {
        builder.withFirstName("Not set")
                .withLastName("Not set")
                .withLocation("Not set")
                .build();
    }

    public void constructUserType2(UserBuilder builder) {

    }
}
