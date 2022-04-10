import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //  this function is called to clear the screen/terminal
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    //  function that prompts the user for inputs accordingly
    public static void prompt(int val) throws IOException{
        switch(val) {
            case 1:
                System.out.println("\u001B[42m" + "Welcome to Password Encryptor!!!" + "\u001B[0m");
                System.out.print("Enter your password to encrypt it: ");
                String input = br.readLine();
                PasswordManager.encryptor(input);
            break;
            case 2:
                System.out.println("\nDo you wish to decrypt your password?");
                System.out.println("1. Yes\n2. No");
                String in = br.readLine();
                if (in.equalsIgnoreCase("yes") || in.equalsIgnoreCase("y") || in.equals("1"))
                    PasswordManager.decryptor();
                else
                    System.out.println("Thanks for using the Password Encryptor! Have A Nice Day!");
            break;
        }
    }

    //  main method
    public static void main(String[] args) throws IOException{
        clearScreen();
        prompt(1);
    }
}