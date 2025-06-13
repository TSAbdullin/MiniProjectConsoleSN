import java.util.ArrayList;

public class Post {
    private String text;
    private Account author;
    ArrayList<Account> likes = new ArrayList<Account>();

    public Post(String text, Account author) {
        this.text = text;
        this.author = author;
    }


    void like(Account who) {
        likes.add(who);
        System.out.println(who + " поставил лайк под вашим постом!");
    }

    String getInfo() {
        return "Автор: " + author.getName() + "\n" + text + "\nКол-во лайков: " + likes.toArray().length;
    }
}
