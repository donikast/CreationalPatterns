package bg.tu_varna.sit.builder.inner;

public class User {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String location;

    private User() {}

    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    private void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public static class Builder {
        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        private String location;
        private User user;

        public Builder(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withLocation(String location) {
            this.location = location;
            return this;
        }

        public User build() {
            user = new User();
            user.setUserName(userName);
            user.setPassword(password);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setLocation(location);

            return user;
        }
    }
}

