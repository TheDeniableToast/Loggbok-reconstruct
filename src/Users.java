import java.util.ArrayList;

public class Users {
    ArrayList<Author> authors;
    String name;

    public Users(String usersName) {
        authors = new ArrayList<>();
        this.name = usersName;
    }

    public void addAuthor(Author e) {
        authors.add(e);
    }

    public static void main(String[] args) {
        Author filip = new Author("Filip", "18");
        Users te18 = new Users("Te18");
        te18.addAuthor(filip);
    }
}
