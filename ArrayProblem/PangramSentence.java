package javaCode.ArrayProblem;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class PangramSentence {
    public boolean checkIfPangram(String sentence) {
        int[] alpha = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            int num = sentence.charAt(i) - 'a';
            alpha[num]++;
        }
        for (int i : alpha)
            if (i == 0)
                return false;
        return true;
    }
}
