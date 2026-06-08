package Week2.Day1;

import java.util.HashMap;

public class Ransome_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        int mlen=magazine.length();
        for (int i = 0 ; i<mlen ; i++){
            char k= magazine.charAt(i);
            if(map.containsKey(k)){
                map.put(k,(map.get(k))+1);
            }
            else{
                map.put(k,1);
            }
        }
        int rlen=ransomNote.length();
        for(int i=0; i<rlen ; i++){
            char k=ransomNote.charAt(i);
            if(map.containsKey(k) && (map.get(k))>0){
                map.put(k,(map.get(k))-1);
            }
            else{return false;}
        }
        return true;
    }
}
