import java.io.IOException;

public class PasswordManager {
    
    //  instance variables
    private static String encryptedPassword = "";
    private static int vals[];

    //  function that encrypts the password
    public static void encryptor(String input) throws IOException{
        Main.clearScreen();
        vals = new int[input.length()];
        //  encrypting the password
        for(int i = 0; i < vals.length; i++) {
            vals[i] = (int)(input.charAt(i)) ^ i;
            encryptedPassword += (char)vals[i];
        }
        System.out.println("Your encrypted Password is: " + "\u001B[42m" + encryptedPassword + "\u001B[0m");
        Main.prompt(2);
    }

    //  function that decrypts the encrypted password
    public static void decryptor() {
        Main.clearScreen();
        //  decrypting the password
        String decryptedPassword = "";
        for(int i = 0; i < vals.length; i++) 
            decryptedPassword += (char)(vals[i] ^ i);
        System.out.println("Your decrypted password is: " + "\u001B[42m" + decryptedPassword + "\u001B[0m");
    }

    //  main method
    public static void main(String[] args) {
    }
}
