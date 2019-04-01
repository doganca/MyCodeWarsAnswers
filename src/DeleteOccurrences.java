import java.util.ArrayList;

public class DeleteOccurrences {
    /*
     * Given a list lst and a number N,
     * create a new list that contains each number of lst at most N times without reordering.
     * For example if N = 2, and the input is [1,2,3,1,2,1,2,3],
     * you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times,
     * and then take 3, which leads to [1,2,3,1,2,3].*/

    public static void main(String[] args) {
        int[] cevap = deleteNth(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 1, 3, 3, 7, 2, 2, 2, 2}, 3);
        for (int a : cevap) {
            System.out.print(a + " ");
        }
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (elements.length < 2) {
            return elements;
        }

        for (int i = 0; i < elements.length; i++) {
            arr.add(elements[i]);
            int counter = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == elements[i]) {
                    counter++;
                }
                if (counter > maxOccurrences) {
                    arr.remove(arr.size() - 1);
                }
            }

        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
