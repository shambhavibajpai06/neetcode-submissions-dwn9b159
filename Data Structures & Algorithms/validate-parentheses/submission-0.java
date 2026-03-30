class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(char c : s.toCharArray()){
            if(map.containsKey(c))
            st.push(c);
            else if(map.containsValue(c)){
                if(st.isEmpty() || map.get(st.pop()) != c)
                return false;
            }
        }
        return st.isEmpty();
    }
}
