public class Admin extends Account {

    public Admin(String name, String email) {
        setName(name);
        setEmail(email);
    }

    @Override
    String getRole() {
        return "Admin";
    }
}
