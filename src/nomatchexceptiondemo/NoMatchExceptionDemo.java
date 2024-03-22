/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomatchexceptiondemo;
import java.util.Scanner;

/**
 *
 * @author Lenovo-User
 */
public class NoMatchExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            checkMatch(input);
            System.out.println("String matches 'Symbiosis'.");
        } 
        catch (NoMatchException e) {
            System.out.println("NoMatchException: " + e.getMessage());
        }
    }
    }
 public static void checkMatch(String input) throws NoMatchException {
        if (!input.equals("Symbiosis")) {
            throw new NoMatchException("String does not match 'Symbiosis'.");
}
}
}
}

    



    

