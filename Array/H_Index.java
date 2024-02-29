import java.util.Arrays;

public class H_Index {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;

        for (int i = 0; i < n; i++) {
            int h = Math.min(citations[i], n - i);
            hIndex = Math.max(hIndex, h);
        }

        return hIndex;
    }

    public static void main(String[] args) {
        H_Index solution = new H_Index();

        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println("Output for citations1: " + solution.hIndex(citations1)); // Output: 3

        int[] citations2 = {1, 3, 1};
        System.out.println("Output for citations2: " + solution.hIndex(citations2)); // Output: 1
    }
}

//Time complexity: O(n log n) where n is the number of papers/research articles the researcher has published
//the algorithm involves sorting the citations array, which has a time complexity of O(n log n)
//using a comparison-based sorting algorithm (like the one used in Java's Arrays.sort() method),
//and then iterating through the sorted array once, which takes O(n) time.

//Space complexity: O(1)
//because the algorithm only uses a constant amount of extra space for variables such as n, hIndex,
// and the loop index 'i'. The sorting operation is performed in-place on the original array, so no
//additional space is used for that
