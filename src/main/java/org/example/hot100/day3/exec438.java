package org.example.hot100.day3;

import java.util.ArrayList;
import java.util.List;

public class exec438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;
        int pNum = 0, sNum = 0 ,left = 0;
        for (int i = 0; i < p.length(); i++) {
            pNum += (p.charAt(i) - 'a');
        }
        for (int i = 0; i < s.length(); i++) {
            sNum += (s.charAt(i) - 'a');
            if (i - left + 1 < p.length()){
                continue;
            }
            if (sNum == pNum){
                ans.add(left);
            }
            sNum -= s.charAt(left) - 'a';
            left++;
        }
        return ans;

    }

    public static void main(String[] args) {
        new exec438().findAnagrams("abab", "ab");
    }
}
