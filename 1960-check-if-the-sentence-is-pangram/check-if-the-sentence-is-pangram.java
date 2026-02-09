class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (char ch : alphabet.toCharArray()) {
            if (!sentence.contains(String.valueOf(ch))) {
                return false;
            }
        }

        return true;
    }
}
