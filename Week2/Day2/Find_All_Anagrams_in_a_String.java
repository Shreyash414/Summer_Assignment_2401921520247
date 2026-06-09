package Week2.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (m > n) return ans;

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < m; i++) {
            pFreq[p.charAt(i) - 'a']++;
            windowFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, windowFreq)) {
            ans.add(0);
        }

        for (int i = m; i < n; i++) {
            windowFreq[s.charAt(i) - 'a']++;
            windowFreq[s.charAt(i - m) - 'a']--;

            if (Arrays.equals(pFreq, windowFreq)) {
                ans.add(i - m + 1);
            }
        }

        return ans;
    }
}
