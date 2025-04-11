package com.LeetCode.Easy;

public class CountPrefixSufix {
     public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length;++i){
            for(int j=i+1; j<words.length;++j){
                if(isPrefixAndSuffix(words[i],words[j]))
                    count++;
            }
        }
        System.out.println("count: "+count);
        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2){
        if(str1.length()>str2.length())
            return false;
        String prefix = str2.substring(0, str1.length());
        String suffix = str2.substring(str2.length()-str1.length(), str2.length());
        System.err.println("pre :"+prefix);
        System.out.println("suf : "+ suffix);
            return prefix.equals(str1) && suffix.equals(str1);
         
    }
    public static void main(String[] args) {
        CountPrefixSufix  obj = new CountPrefixSufix();
        obj.countPrefixSuffixPairs(new String[] {"a","aba","ababa","aa"});
    }
}
