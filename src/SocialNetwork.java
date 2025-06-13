import java.util.ArrayList;

public class SocialNetwork {
    ArrayList<Account> users = new ArrayList<Account>();
    ArrayList<Post> allPosts = new ArrayList<Post>();

    void printAllPosts() {
        for (Post post : allPosts) {
            System.out.println(post.getInfo());
        }
    }

    void removePost(Post post) {
        allPosts.remove(post);
        System.out.println("Пост успешно удален. Спасибо за модерацию!");
    }

    void removeUser(Account user) {
        users.remove(user);
        System.out.println("Пользователь " + user.getName() + " был удален!");
    }

    public static void main(String[] args) {
        User u1 = new User("Тимур", "timur@x.com");
        User u2 = new User("Маша", "masha@x.com");

        u1.addFriend(u2);
        u2.createPost("Привет, это мой первый пост!", u1);

        u1.getFeed(); // показывает посты u2

    }
}
