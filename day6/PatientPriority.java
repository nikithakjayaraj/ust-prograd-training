import java.util.PriorityQueue;


public class PatientPriority {
    public static void main(String[] args) {
        PriorityQueue<Integer>  priority=new PriorityQueue<>();
        priority.add(3);
        priority.add(1);
        priority.add(2);
        System.out.println(priority);

        priority.poll();
        System.out.println(priority);

        priority.add(1);
        priority.add(4);
        System.out.println(priority);

        priority.remove(3);
        System.out.println(priority);

        System.out.println(priority.size());
        priority.forEach(patient -> System.out.println(patient));

        System.out.println("Removed element:"+priority.poll());                  //used to retrieves and removes the head of this queue
        System.out.println("Head of the queue:"+priority.element());             //used to retrieves, but does not remove, the head of this queue
        priority.clear();
        System.out.println(priority.peek());                                    //used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    }
}