public class Moderator extends Account {

    public Moderator(String name, String email) {
        setEmail(email);
        setName(name);
    }

    @Override
    String getRole() {
        return "Модератор";
    }
}
