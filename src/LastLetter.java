

import java.util.*;
class Main {

    public static void main(String[] args) {


        //TESTS

        System.out.println(wordMultiple(List.of("a", "b", "a", "c", "b"))); // {a=true, b=true, c=false}
        System.out.println(wordMultiple(List.of("c", "b", "a" ))); // {a=false, b=false, c=false}
        System.out.println(wordMultiple(List.of("c", "c", "c" , "c"))); // {c=true}

    }




    public static Map<String, Boolean> wordMultiple(List<String> words){

        Map<String, Boolean> result = new HashMap<>();
        for (String word : words) {
            result.put(word, result.containsKey(word));
        }
        for (String word : result.keySet()) {
            result.put(word,result.get(word));
        }
        return result;
    }
}