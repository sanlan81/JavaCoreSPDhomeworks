public class InvertString {
    public static void main(String[] args) {

        String s1 = "My rainbow is cool !";

        StringBuilder stringBuilder = new StringBuilder(s1);

        System.out.println(stringBuilder.reverse().toString());
    }
}
