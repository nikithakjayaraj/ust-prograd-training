import java.util.HashSet;
import java.util.Spliterator;

// Library - add books names that are available
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> availableBooks =new HashSet<>();

        availableBooks.add("The Hunger Games");
        availableBooks.add("Harry Potter and the Order of the Phoenix ");
        availableBooks.add("To Kill a Mockingbird by Harper Lee");
        availableBooks.add("Pride and Prejudice by Jane Austen");
        availableBooks.add("Twilight");

        System.out.println(availableBooks);

        availableBooks.add("The Hunger Games");
        System.out.println(availableBooks);

        System.out.println(availableBooks.contains("The Hunger Games"));

        availableBooks.remove("Twilight");
        availableBooks.forEach(books-> System.out.println(books));

        System.out.println(availableBooks.isEmpty());

        System.out.println(availableBooks.size());

        Spliterator<String> books=availableBooks.spliterator();
        books.forEachRemaining(System.out::println);
    }

}
