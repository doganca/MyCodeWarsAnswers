public class GetTheMiddleCharacter {

    /*
     *You are going to be given a word. Your job is to return the middle character of the word.
     *  If the word's length is odd, return the middle character.
     *  If the word's length is even, return the middle 2 characters.
     *
     *  ("test") should return "es"
        ("testing") should return "t"
        ("middle") should return "dd"
        ("A") should return "A"
     * */
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }

    public static String getMiddle(String word) {
        char[] wordArray = word.toCharArray();
        String answer = "";
        int size = word.length();

        if (wordArray.length == 1) {
            return word;
        }
        if (wordArray.length % 2 == 0) {
            answer += wordArray[size / 2 - 1];
            answer += wordArray[size / 2];
        }

        if (wordArray.length % 2 != 0) {
            answer += wordArray[size / 2];
        }
        return answer;
    }
}
