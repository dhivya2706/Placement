
class Missing {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = arr.length+1;
        int tot = 0;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < n-1; i++) {
            tot += arr[i];
        }
        int res = sum - tot;
        System.out.println(res);
    }
}
