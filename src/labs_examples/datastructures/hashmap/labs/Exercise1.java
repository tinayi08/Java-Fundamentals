package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

public class Exercise1 {

    /**
     *  HashMaps Exercise_01
     *
     *  Demonstrate you're mastery of using Java's built-in HashMap class below.
     *
     *  Using a HashMap demonstrate the use of the following methods:
     *
     *  put()
     *  get()
     *  putAll()
     *  size()
     *  contains()
     *  keySet()
     *  entrySet()
     *  putIfAbsent()
     *  remove()
     *  replace()
     *  forEach()
     *  clear()
     *
     */

    public static void main(String[] args) {
        HashMap<String, Integer> id = new HashMap<>();
        id.put("Tina", 495);
        id.put("Cameron", 423);
        id.put("Angie", 123);
        id.put("Alex", 345);

        int tinaID = id.get("Tina");
        System.out.println("Tina's ID is " + tinaID);

        HashMap<String, Integer> idNew = new HashMap<>();

        idNew.putAll(id);
        System.out.println("New HashMap: " + idNew);

        int size = idNew.size();
        System.out.println("Size of idNew is: " + size);

        if(idNew.containsKey("Tina")) {
            System.out.println("Tina is included in the list");

        } else {
            System.out.println("Tina is not included in the list");
        }

        System.out.println("This is the key set:" + idNew.keySet());

        System.out.println("This is the entry set: " + idNew.entrySet());

        idNew.putIfAbsent("Tina", 495);
        idNew.putIfAbsent("Matt", 455);
        System.out.println(idNew);

        idNew.remove("Tina");
        System.out.println(idNew);

        idNew.replace("Angie", 234);
        System.out.println("Angie's new id number is: " + idNew.get("Angie"));

        for (HashMap.Entry<String, Integer> entry : idNew.entrySet()) {
            System.out.println(entry.getKey() + " has ID number: " + entry.getValue());
        }

        idNew.clear();
        System.out.println("HashMap has been cleared: " + idNew);
    }
}
