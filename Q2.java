import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;
        
        for(int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if(Character.toLowerCase(letter) == 'a') {
                count++;
            }
        }
        
        System.out.printf("O texto inserido contém a letra 'a' %d vezes", count);
        sc.close();
    }
}
