package bg.tu_varna.sit.builder.outer;

public class UserType1Builder implements UserBuilder{
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String location;
    private User user;

    public UserType1Builder(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserBuilder withLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    @Override
    public UserBuilder withLocation(String location) {
        this.location=location;
        return this;
    }

    @Override
    public User build() {
        user = new User(userName, password, firstName, lastName, location);
        return user;
    }

    public User getUser() {
        return user;
    }
}
