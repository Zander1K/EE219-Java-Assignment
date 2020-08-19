public class CharCount {
    public static int charCount(String s, char c) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("The Number of Occurences is: " + charCount("Classroom cannot commence", 'a'));
    }
}
