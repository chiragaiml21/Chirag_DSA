package Arrays.Questions;

import java.util.HashMap;

public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        System.out.println(checkIfPangram(sentence));
        checkIfPangram(sentence);
    }
    public static void checkIfPangram(String sentence) {
        HashMap<String, Integer> map = new HashMap<>();
        for(char c='a'; c<='z'; c++){
            map.put(String.valueOf(c),0);
        }

        for(int i=0; i<sentence.length(); i++){
                Integer count = map.get(sentence.charAt(i));
                map.put(String.valueOf(sentence.charAt(i)), 1);
        }

//        for(char c='a'; c<='z'; c++){
//            if(map.get(c)==null){
//                return false;
//            }
//        }

        System.out.println(map.get('a'));
    }
}
