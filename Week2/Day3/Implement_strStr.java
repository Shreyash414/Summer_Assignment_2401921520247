package Week2.Day3;

public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        int nlen= needle.length();
        int hlen=haystack.length();
        // int i=0;
        // int j=0;
        // if(nlen>hlen){
        //     return -1;
        // }
        // while(i+j<hlen){
        //     char k2=needle.charAt(j);
        //     char k1=haystack.charAt(i+j);
        //     if(k1==k2){
        //         j++;
        //     }
        //     else{
        //         i++;
        //         j=0;
        //     }
        //     if(j==nlen){
        //         return i;
        //     }
        // }
        // return -1;
        for(int i=0;i<=hlen-nlen; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+nlen).equals(needle)){
                    return i;
                }
            }
        }
        return -1;

    }

}
