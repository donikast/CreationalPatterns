package bg.tu_varna.sit.builder.outer;

public interface UserBuilder {
    UserBuilder withFirstName(String firstName);
    UserBuilder withLastName(String lastName);
    UserBuilder withLocation(String firstName);
    User build();
    User getUser();
}



