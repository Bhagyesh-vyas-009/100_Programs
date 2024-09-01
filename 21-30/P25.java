public class P25 {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6},m=4;

        int res = isInArray(arr, m);
        if (res == 1)
            System.out.println("Element is found in array");
        else
            System.out.println("Element is not found in array");
    }

    private static int isInArray(int[] a, int m) {
        return findElement(a, m, 0);
    }

    private static int findElement(int[] a, int m, int i) {
        if (a.length == i)
            return 0;

        if (a[i] == m)
            return 1;

        return findElement(a, m, i + 1);
    }
}
