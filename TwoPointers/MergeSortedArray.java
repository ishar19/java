package javaCode.TwoPointers;


//With extra space it's easy, without extra space it's a bit tricky 
//Start from the end of both array and keep a pointer at the end of the bigger array where elements would be inserted
public class MergeSortedArray {
    public void merge(int[] a, int m, int[] b, int n) {
        if (m == 0 || n == 0) {
            return;
        }
        int i = n - 1;
        int j = m - 1;

        int lastIndex = n + m - 1;

        // Merge a and b, starting
        // from last element in each
        while (j >= 0) {

            /* End of a is greater than end of b */
            if (i >= 0 && a[i] > b[j]) {
                // Copy Element
                a[lastIndex] = a[i];
                i--;
            } else {
                // Copy Element
                a[lastIndex] = b[j];
                j--;
            }
            // Move indices
            lastIndex--;
        }
    }
}
