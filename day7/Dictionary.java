import java.util.TreeMap;

class Dictionary{

    TreeMap<String, String> dictionary;

    public Dictionary(){
        // your code
        dictionary=new TreeMap<>();
    }

    public void newEntry(String key, String value){
        // your code

        dictionary.put(key,value);
    }

    public String look(String key) {
        // your code
        return dictionary.getOrDefault(key,"Cant find entry for "+key);

    }
}

public class SampleTest {
    public static void main(String[] args) {

       Dictionary d=new Dictionary();
        d.newEntry("Apple", "A fruit");
        d.newEntry("Soccer", "A sport");
        d.newEntry("soccer", "a sport");


        System.out.println(d.look("Apple"));
        System.out.println(d.look("Soccer"));
        System.out.println(d.look("Hi"));


    }
}
