class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0){
          return Character.toString((char)258);
        }

        String s = Character.toString((char)257);

        StringBuilder sb = new StringBuilder();
        for(String i : strs){
            sb.append(i);
            sb.append(s);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals(Character.toString((char)258))){
            return new ArrayList();
        }

        String st = Character.toString((char)257);
        return Arrays.asList(str.split(st, -1));
    }
}
