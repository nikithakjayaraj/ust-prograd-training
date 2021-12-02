import java.util.Scanner;

 class IllegalUsernameException extends Exception {
    public IllegalUsernameException(String message) {
        super(message);
    }

}
class IllegalPasswordException extends Exception{
     public IllegalPasswordException(String message){
         super(message);
     }
}
public class LoginException{

    public static void main(String[] args) throws IllegalUsernameException, IllegalPasswordException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the username:");
        String username= scanner.nextLine();
        System.out.println("Enter the password:");
        String password= scanner.nextLine();

        if(!(username.length()>6 && username.length()<15)){
            throw new IllegalUsernameException("Username should be from 6-15 characters");
        }

        char first=username.charAt(0);
        if(!(first>=65 && first<=90))
        {
            throw new IllegalUsernameException("Username must start with an uppercase English alphabet A to Z");
        }
        if((username.contains("(") || username.contains(")") || username.contains(" "))){
            throw new IllegalPasswordException("Username should not contain any parenthesis or whitespace");
        }
        if(password.contains(username)){
            throw new IllegalUsernameException("Password cannot contain or be the same as its associated username");
        }
        if(!(password.length()>8 && password.length()<256))
        {
            throw new IllegalPasswordException("Password should be from 8-256 characters");
        }
        if((password.contains("(") || password.contains(")") || password.contains(" "))){
            throw new IllegalPasswordException("Password should not contain any parenthesis or whitespace");
        }


    }
}
