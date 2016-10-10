
public class InvertString {
    public static void main(String[] args) {

        String s = "Rainbow";

        char[] ms = s.toCharArray();

        for (int i = ms.length - 1; i >= 0; i--) {

            System.out.print(ms[i] + "\t");
        }

    }
}
