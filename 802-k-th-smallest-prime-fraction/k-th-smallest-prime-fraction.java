import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Pair> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ans.add(new Pair(arr[i], arr[j]));
            }
        }
        Collections.sort(ans, (x, y) -> Double.compare((double)x.a / x.b, (double)y.a / y.b));
        return new int[]{ans.get(k - 1).a, ans.get(k - 1).b};
    }
    
    class Pair {
        int a, b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
