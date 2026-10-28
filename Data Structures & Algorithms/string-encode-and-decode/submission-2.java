class Solution {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String s : strs) {
            encodedString.append(s.length()).append('#').append(s);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, hashIndex));
            result.add(str.substring(hashIndex + 1, hashIndex + 1 + length));
            i = hashIndex + 1 + length;
        }
        return result;
    }
}
