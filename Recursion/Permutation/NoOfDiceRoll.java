package Permutation;

public class NoOfDiceRoll {
    public static void main(String[] args) {
        dice("", 7);
        System.out.println(count%(10^9+7));
    }

    static int count;

    static void dice(String p, int target) {
        if (target == 0) {
                count+=1;
            
            }
            return;
        
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }
}
