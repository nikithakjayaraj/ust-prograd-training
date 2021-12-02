import java.util.Iterator;
import java.util.LinkedList;

//Music Player
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> playlist=new LinkedList<>();
        playlist.add("Shape of you");
        playlist.add("Faded");
        playlist.add("Go in peace");
        playlist.add("Love me like you do");
        System.out.println(playlist);
        playlist.remove(3);
        System.out.println(playlist);

        playlist.forEach(songs -> System.out.println(songs));
        System.out.println(playlist.lastIndexOf("Baby"));

        playlist.addLast("Go on");
        System.out.println("Elements in the list using iterator:");
        for(Iterator<String> it = playlist.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        System.out.println("Elements in the list using foreach:");
        playlist.set(2,"Baby");
        playlist.forEach(songs -> System.out.println(songs));

        System.out.println("First element using element():"+playlist.element());  //retrieve the first element of a list.
        System.out.println("First element using getFirst():"+playlist.getFirst());
        System.out.println("Last element using getLast():"+playlist.getLast());

        playlist.offer("Sorry");           //adds the specified element as the last element of a list
        System.out.println(playlist);

        playlist.offerFirst("Believer");   //inserts the specified element at the front of a list
        System.out.println(playlist);

        System.out.println(playlist.peek());   //retrieves the first element of a list
        System.out.println(playlist.poll());   //retrieves and removes the first element of a list
        System.out.println(playlist);

        System.out.println(playlist.pop());   //retrieves and removes the first element of a list
        System.out.println(playlist);

        playlist.clear();
        System.out.println(playlist);

    }
}
