public class MinMax {
    public static void main(String[] args) {
        /*Write a function that returns both the minimum and maximum number of the given list/array.
        minMax(new int[]{1,2,3,4,5}) == {1,5}
        minMax(new int[]{2334454,5}) == {5, 2334454}
        minMax(new int[]{1}) == {1, 1}
        * */
        int[] answer = minMax(new int[]{1});

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }

    public static int[] minMax(int[] arr) {
        int[] answer = new int[2];
        int biggest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        answer[0] = smallest;
        answer[1] = biggest;

        return answer;
    }
}
