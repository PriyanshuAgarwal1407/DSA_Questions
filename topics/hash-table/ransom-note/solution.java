class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        HashMap<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            int val = dic.getOrDefault(ch, 0);
            dic.put(ch, val + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            int val = dic.getOrDefault(ch, 0);

            if (val > 0) {
                dic.put(ch, val - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}