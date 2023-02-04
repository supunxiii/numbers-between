import java.util.Scanner;
public class numbersBetween{
    public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int firstint = userinput.nextInt();
    System.out.print("Enter the second integer: ");
    int secondint = userinput.nextInt();
    if (secondint > firstint) {
        for (int i = firstint + 1; i < secondint; i++){
          System.out.print(i + " ");}
    } else {
      for (int i = secondint + 1; i < firstint; i++){
            System.out.print(i + " ");
          }
        }
      }
    }
