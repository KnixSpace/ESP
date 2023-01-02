import EHMS.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws IOException {
        boolean status = true;
        Headers header = new Headers();
        Portal portal = new Portal();
        System.out.println("+----------------------------------------+");
        System.out.println("+  --> E-Hospital Management System <--  +");
        System.out.println("+----------------------------------------+");
        while (status) {
            int choice;
            while (true) {
                try {
                    header.MainHeader();
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter Your Choice : ");
                    choice = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Entry!!.");
                }
            }
            switch (choice) {
                case 1:
                    portal.adminPortal();
                    break;
                case 2:
                    portal.doctorPortal();
                    break;
                case 3:
                    portal.patientPortal();
                    break;
                case 4:
                    portal.newSignup();
                    break;
                case 5:
                    System.out.println("Thank-you And Visit Again");
                    status = false;
                    break;
                default:
                    System.out.println("Invalid Entry!!.");
                    break;
            }
        }
    }
}
