class Solution {
    public String longestCommonPrefix(String[] strs) {
       int l =  strs.length;
       if( l == 0 || strs == null) return "";
       String prefix = strs[0];
       for(int i = 0; i < l; i++){
        while(strs[i].indexOf(prefix) != 0){
            prefix = prefix.substring(0, prefix.length()-1);

            if(prefix.isEmpty())
            return "";
        }
       }
       return prefix;
    }
}