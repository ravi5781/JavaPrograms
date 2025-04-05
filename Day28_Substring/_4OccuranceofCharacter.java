package Day28_Substring;

import java.util.HashMap;

// occurance of
public class _4OccuranceofCharacter {
    public static void main(String[] args) {
        String s="malayalamaa";
        HashMap<Character,Integer> map=new HashMap<>();
        System.out.println(map);

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for(char ch:map.keySet()){
            System.out.println(ch+" : "+map.get(ch));
        }
    }
}
