class Solution {
    public String minWindow(String s, String t) {

        if(s.length() == 0 || t.length() == 0 || s.length() < t.length())
            return "";

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) + 1);
        }

        int required = map.size();
        int form = 0;

        int l = 0, r = 0;

        int[] ans = {-1,0,0};

        Map<Character,Integer> window = new HashMap<>();

        while(r < s.length()){

            char c = s.charAt(r);

            window.put(c, window.getOrDefault(c,0) + 1);

            if(map.containsKey(c) && window.get(c).intValue() == map.get(c).intValue()){
                form++;
            }

            while(l <= r && form == required){

                c = s.charAt(l);

                if(ans[0] == -1 || r-l+1 < ans[0]){
                    ans[0] = r-l+1;
                    ans[1] = l;
                    ans[2] = r;
                }

                window.put(c, window.get(c) - 1);

                if(map.containsKey(c) && window.get(c).intValue() < map.get(c).intValue()){
                    form--;
                }
                l++;
            }
            r++;
        }

        if(ans[0] == -1) return "";

        return s.substring(ans[1], ans[2] + 1);
    }
}