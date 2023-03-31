package OOP;

public class User extends Person {

    private int id;
    private int password;
    String username;

    public User(String fName, String lName, int age, String username, int id, int password) {
        super(fName, lName, age);
        this.username = username;
        this.id = id;
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password=" + password +
                ", userName='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
