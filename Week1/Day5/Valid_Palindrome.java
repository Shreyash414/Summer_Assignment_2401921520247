package Week1.Day5;

public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int length = s.length();
        int i=0;
        int j = length - 1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
