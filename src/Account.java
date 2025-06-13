import java.util.ArrayList;

public abstract class Account {
    private String name;
    private String email;
    ArrayList<Account> friends = new ArrayList<Account>();
    ArrayList<Post> posts = new ArrayList<Post>();

    void addFriend(Account person) {
        friends.add(person);
        System.out.println("Вы добавили " + person.getName() + " в друзья!");
    }

    void createPost(String text, Account account) {
        posts.add(new Post(text, account));
    }

    abstract String getRole();

    void getFeed() {
        for (Account account : friends) {
            for (Post post : account.posts) {
                System.out.println(post.getInfo());
            }
        }
    }

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
