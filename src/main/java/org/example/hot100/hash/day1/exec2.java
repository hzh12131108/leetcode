package org.example.hot100.hash.day1;

import javax.jnlp.IntegrationService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class exec2 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            int[] charCount = new int[26];
            for (int i = 0; i < str.length(); i++) {
                charCount[str.charAt(i) - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < charCount.length; i++) {
                if (charCount[i] != 0){
                    key.append((char)('a' + i)).append(charCount[i]);
                }
            }
            List<String> tmp = res.getOrDefault(key.toString(), new ArrayList<>());
            tmp.add(str);
            res.put(key.toString(), tmp);
        }
        List<List<String>> ans = new ArrayList<>();
        res.forEach((k,v) -> {
            ans.add(v);
        });
        return ans;
    }

    public static void main(String[] args) {
        new exec2().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}
