import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Student management
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> student =new ArrayList<>();
        student.add("Nikitha");
        student.add("Anjitha");
        student.add("Sandeep");
        student.add("Mohan");
        Collections.sort(student);
        System.out.println(student);
        Collections.reverse(student);
        System.out.println(student);

        student.remove("Sandeep");
        student.forEach(names -> System.out.println(names));

        for(int i=0;i< student.size();i++){
            System.out.println(student.get(i));

        }

        student.add(2,"Sonu");
        System.out.println(student);

        Collections.sort(student);
        for(Iterator<String> it = student.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        System.out.println("Size of list:"+student.size());
        System.out.println(student.isEmpty());
        System.out.println("Index of element:"+student.indexOf("Mohan"));
        System.out.println(student.contains("Nikitha"));
        System.out.println("Element that present in the index:"+student.get(1));
        System.out.println(student.lastIndexOf("Mohan"));  // index in this list of the last occurrence of the specified element
        Object[] arr=student.toArray();

        for(Object array : arr) {
            System.out.println(array);
        }

        System.out.println(student.subList(1,3));
        
    }

}
