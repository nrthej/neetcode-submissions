class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<String, List<String>> groups = new HashMap<String, List<String>>();
        for ( String S: strs){
            int[] count = new int[26];
            for (char c: S.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if (!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(S);
        }


        List<List<String>> result =  new ArrayList<List<String>>(groups.values());
        return result;
        
    }
}
