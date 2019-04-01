public class TriangularTreasure {

    /*Triangular numbers are so called because of the equilateral,
     triangular shape that they occupy when laid out as dots. i.e.
      triangular 0     == 0,
      triangular 2     == 3,
      triangular 3     == 6,
      triangular (-10) == 0
     */
    public static void main(String[] args) {
        System.out.println(triangular(3));
        System.out.println(triangular(2));
        System.out.println(triangular(4));
        System.out.println(triangular(1));
        System.out.println(triangular(0));
    }

    public static int triangular(int n) {
        int counter = 0;
        if (n <= 0) {
            return 0;
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                counter++;
            }
        }
        return counter;
    }


}
