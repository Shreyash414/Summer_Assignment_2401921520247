package Week2.Day1;

import java.util.HashMap;

public class First_Unique_Character_in_String {
    public int firstUniqChar(String s) {
        int len=s.length();
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<len;i++){
            char k=s.charAt(i);
            if(map.containsKey(k)){
                map.put(k,(map.get(k))+1);
            }
            else{
                map.put(k,1);
            }
        }
        for(int i=0;i<len;i++){
            char k=s.charAt(i);
            if(map.get(k)==1){
                return i;
            }
        }
        return -1;
    }
}
