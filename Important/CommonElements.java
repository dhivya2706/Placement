public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5,7,9,10};
        int[] arr2 = {2,7,8,9};

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
    }
}