public class User extends Account {
    public User(String name, String email) {
        setEmail(email);
        setName(name);
    }

    @Override
    String getRole() {
        return "Обычный пользователь";
    }
}
