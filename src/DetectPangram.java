public class DetectPangram {
    /*
     * A pangram is a sentence that contains every single letter of the alphabet at least once.
     * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
     * because it uses the letters A-Z at least once (case is irrelevant).
     * Given a string, detect whether or not it is a pangram.
     * Return True if it is, False if not.
     * Ignore numbers and punctuation.*/

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
        System.out.println(check(" a b c d e f g h i j k L m n o p q r s t u v w x y "));


    }
    private static boolean check(String sentence) {
        boolean status = false;
        char[] sentenceArr = sentence.toLowerCase().toCharArray();
        char[] alphabet = new char[26];
        int asciiLowerCaseA = 97;
        int asciiLowerCaseZ = 122;
        int counter = 0;

        if (sentenceArr.length < 26) {
            return status;
        }

        for (int i = asciiLowerCaseA, j = 0; i <= asciiLowerCaseZ; i++, j++) {
            alphabet[j] = (char) i;
        }

        for (int i = 0; i < alphabet.length; i++) {
            status = false;
            for (int j = 0; j < sentenceArr.length; j++) {
                if (alphabet[i] == sentenceArr[j]) {
                    status = true;
                }
            }
            if (!status) {
                return status;
            }
        }
        return status;
    }
}
