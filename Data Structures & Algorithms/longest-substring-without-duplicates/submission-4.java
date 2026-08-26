class Solution {
    public int lengthOfLongestSubstring(String s) {
   Set<Character>set = new HashSet<>();
   int l=0;
   int res=0;
   int cur=0;
    for(int r=0; r<s.length(); r++){
    
        char ch = s.charAt(r);
        
       while(set.contains(ch)){
             set.remove(s.charAt(l));
            l++;
           
        }
         set.add(ch);
    res=Math.max(res,set.size());
    }
    return res;
    }
}
