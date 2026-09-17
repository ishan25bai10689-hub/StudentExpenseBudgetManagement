public class User {

    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        User user = new User(
                1,
                "Ishan Haswani"
        );

        System.out.println("================================");
        System.out.println("         USER TEST");
        System.out.println("================================");

        user.displayUser();
    }
}