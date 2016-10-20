import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        String revertOutText = "";
        String[] mas = inputText.split(" ");

        for (int i = mas.length - 1; i >= 0; i--) {
            revertOutText += mas[i] + " ";
        }

        System.out.println(revertOutText);
    }
}
