package Week2.Day1;

import java.util.HashMap;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int slen=s.length();
        int tlen= t.length();
        if(slen!=tlen) return false;
        for(int i=0;i<slen;i++){
            char k=s.charAt(i);
            if(map.containsKey(s.charAt(i))){
                map.put(k,(map.get(k))+1);
            }
            else{
                map.put(k,1);
            }
        }

        for(int i=0;i<tlen;i++){
            char k=t.charAt(i);
            if(map.containsKey(k)){
                map.put(k,map.get(k)-1);
            }
            else{return false;}
            if(map.get(k)==0){
                map.remove(k);
            }
        }
        return true;
    }
}
