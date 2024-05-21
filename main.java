
// TODO - 50 exercises to refresh
// https://www.digitalocean.com/community/tutorials/java-programming-interview-questions
public class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //Exercise 1 - Reverse string
    public static String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }
}
