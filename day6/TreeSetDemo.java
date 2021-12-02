import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> availableBooks =new TreeSet<>();
        availableBooks.add("The Hunger Games");
        availableBooks.add("Harry Potter and the Order of the Phoenix ");
        availableBooks.add("To Kill a Mockingbird by Harper Lee");
        availableBooks.add("Pride and Prejudice by Jane Austen");
        availableBooks.add("Twilight");
        System.out.println(availableBooks);

        availableBooks.add("The Hunger Games");
        System.out.println(availableBooks);

        System.out.println();
        System.out.println(availableBooks.contains("The Hunger Games"));

        availableBooks.remove("Twilight");
        availableBooks.forEach(books-> System.out.println(books));

        System.out.println();
        System.out.println(availableBooks.ceiling("The Hunger Games"));
        System.out.println(availableBooks.ceiling("The alchemist"));


        System.out.println("First element: "+availableBooks.first());
        System.out.println("Last element: "+availableBooks.last());

        System.out.println();
        System.out.println(availableBooks.floor("The alchemist"));

        System.out.println("HeadSet: "+availableBooks.headSet("The Hunger Games"));

        System.out.println();
        System.out.println("Closest greatest element: "+availableBooks.higher("To Kill a Mockingbird by Harper Lee"));
        System.out.println("Closest greatest element: "+availableBooks.higher("The Hunger Games"));
        System.out.println("Closest least element: "+availableBooks.lower("The Hunger Games"));

        System.out.println("Removed element: "+availableBooks.pollFirst());   // retrieve and remove the lowest(first) element.
        System.out.println("Removed element: "+availableBooks.pollLast());    // retrieve and remove the highest(last) element.




    }
}
