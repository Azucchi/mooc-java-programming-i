
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};
        
        System.out.println("Enter username:");
        String user = scanner.nextLine();
        System.out.println("Enter password:");
        String pass = scanner.nextLine();
        boolean succ = false;
        
        for (int i = 0; i < username.length; i++) {
            if(user.equals(username[i]) && pass.equals(password[i])){
                System.out.println("You have successfully logged in!");
                succ = true;
            }
        }
        if (!succ) {
            System.out.println("Incorrect username or password!");
        }

    }
}
