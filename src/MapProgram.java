import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main (String [] args){
        Map<String, String> languages = new HashMap<>();
        languages.put("java", "A compiler , object oriented , platform independent language. ");
        languages.put("Python", "An interpreted, object oriented high level language.");
        languages.put("Algol", "An algorithmic language ");
        System.out.println(languages.put("Basic", "Beginners all purposes symbolic instruction code"));
        System.out.println(languages.put("Lisp", "There in lies madness"));


        if (languages.containsKey("java")){
            System.out.println("Java already exist ");
        } else{
            languages.put("java", "This course is about java");
        }
        System.out.println("===============================================================");
        for (String key: languages.keySet()) {
            System.out.println(key + ":" + languages.get(key));
        }
        //Remove a list from the map
        //languages.remove("Lisp")
    }

}
