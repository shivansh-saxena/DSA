package org.shiv.leetcode;

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        String tmp = word1;
        boolean flag = false;
        if(word1.length() > word2.length()){
            word1 = word2;
            word2 = tmp;
            flag = true;
        }
        int l1 = word1.length();
        String output = "";
        for (int i=0;i<l1;i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            output +=(!flag) ? (""+ch1+""+ch2) : (""+ch2+""+ch1) ;
        }
        output+=(word2.substring(l1));
        return output;
    }
}
