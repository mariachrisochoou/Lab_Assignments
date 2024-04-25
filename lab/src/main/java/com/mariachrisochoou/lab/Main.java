package com.mariachrisochoou.lab;
import java.util.Scanner;
import java.util.ArrayList;

/** This is the main class.
 *
 * 
 * @author mariachrisochoou
 */
public class Main {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        SponsorsManagement sponsors = new SponsorsManagement();
        System.out.println("------------------------------------------");
        System.out.println("This is the Sponsors MENU.");
        System.out.println("Type the number you want to continue with");
        System.out.println("1. Add a new sponsor.");
        System.out.println("2. Update a sponsor.");
        System.out.println("3. Delete a sponsor.");
        System.out.println("4. Show sponsors.");
        System.out.println("5. Leave.");
        System.out.println("------------------------------------------");
        int answer = input.nextInt();


        // until the user types something else rather than not, keep asking for info.
        while (answer != 5) {

            if (answer == 1) {
                System.out.print("Company Id: ");
                int ID = input.nextInt();
                input.nextLine(); 

                System.out.print("Company name: ");
                String name = input.nextLine();

                System.out.print("Company Industry: ");
                String industry = input.nextLine();

                System.out.print("Company Phone number: ");
                String number = input.nextLine();
 
            
                System.out.print("Company Email: ");
                String email = input.nextLine();

                System.out.print("Company Address: ");
                String address = input.nextLine();

                sponsors.addSponsor(ID, name, industry, number, email, address);
            } else if (answer == 2) {
                System.out.println("Type the ID of the company you want to update:");
                int ID = input.nextInt();
                input.nextLine(); 

                System.out.print("Company Industry: ");
                String industry = input.nextLine(); 

                System.out.print("Company Phone number: ");
                String number = input.nextLine(); 
            
                System.out.print("Company Email: ");
                String email = input.nextLine();

                System.out.print("Company Address: ");
                String address = input.nextLine(); 

                sponsors.updateSponsor(ID, industry, number, email, address);
                System.out.println("Sponsor updated successfully!");
            } else if (answer == 3) {
                System.out.println("Type the ID of the company you want to delete:");
                int ID = input.nextInt();
                input.nextLine(); 
                sponsors.showSponsors();
                
                sponsors.deleteSponsor(ID);
                sponsors.showSponsors();

                
            } else if (answer == 4) {
                sponsors.showSponsors();
            }
            
            System.out.println("------------------------------------------");
            System.out.println("This is the Sponsors MENU.");
            System.out.println("Type the number you want to continue with");
            System.out.println("1. Add a new sponsor.");
            System.out.println("2. Update a sponsor.");
            System.out.println("3. Delete a sponsor.");
            System.out.println("4. Show sponsors.");
            System.out.println("5. Leave.");
            System.out.println("------------------------------------------");
            answer = input.nextInt();
        }

        System.out.println("Thank you for using our service!");
    }
}