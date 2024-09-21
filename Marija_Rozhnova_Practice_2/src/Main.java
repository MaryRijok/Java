class Author {
    private String name, email;
    private char gender;

    Author(String newName, String newEmail, char newGender) {
        name = newName;
        email = newEmail;
        gender = newGender;
    }

    void setEmail(String newEmail) {
        email = newEmail;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    char getGender() {
        return gender;
    }

    String getString() {
        // "автор - имя (пол) на адрес электронной почты "
        return name + " (" + gender + ") at " + email;
    }
}

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "JohnDoe@mail.com", 'M');
        System.out.println(author.getString());
    }
}