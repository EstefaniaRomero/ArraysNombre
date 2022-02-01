import java.util.Scanner;

public class ArraysNombre {

    public static void main(String[] args) {

        String word1 = askWordOne();
        String word2 = askWordTwo();
        word2 = revertName(word2);
        System.out.println("Result: " + word1 + word2);

    }

    private static String revertName(String word2) {
        String result = "";

        for (int i = word2.length()-1; i >= 0 ; i--) {

            result += word2.charAt(i);
        }
        return result;

    }

    private static String askWordTwo() {
        Scanner sc = new Scanner(System.in);
        String word2 = "";
        System.out.println("Introdueix un primer nom: " );
        return  word2 = sc.nextLine();
        
        
    }

    private static String askWordOne() {

        Scanner sc = new Scanner(System.in);
        String word1 = "";
        System.out.println("Introdueix un primer nom: " );
        return  word1 = sc.nextLine();

    }


}
