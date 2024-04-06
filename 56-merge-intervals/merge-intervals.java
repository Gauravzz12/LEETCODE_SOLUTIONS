class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> (a[0] - b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int lastEnd = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
                lastEnd = arr[i][1]; 
            } else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
                lastEnd = Math.max(lastEnd, arr[i][1]); 
            }
        }

        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
        return result;
    }
}