import java.util.ArrayList;

public abstract class Account {
    private String name;
    private String email;
    ArrayList<Account> friends;
    ArrayList<Post> posts;

    void addFriend(Account person) {
        friends.add(person);
        System.out.println("Вы добавили " + person + " в друзья!");
    }

    void createPost(String text) {

    }

    abstract String getRole();

    void getFeed() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
