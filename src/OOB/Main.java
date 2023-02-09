package OOB;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("******************** DUOTECH BANK ACCOUNT MANAGEMENT APPLICATION ********************");
        System.out.println("-------------------------------------------------------------------------------------");

        // application logic here
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Please enter the name of the file to load: ");

            String fileName = sc.nextLine();
            List<String[]> list = Utility.readFromCSV(fileName);

            List<Account> ac = new ArrayList<>();

            for (String[] st : list) {

                if (st[2].equals("Checking")) {
                    Checking account = new Checking(st[0], st[1], Double.parseDouble(st[3]));
                    ac.add(account);
                }
                if (st[2].equals("Savings")) {
                    Savings account = new Savings(st[0], st[1], Double.parseDouble(st[3]));
                    ac.add(account);
                }
            }
            for (Account a : ac) {

                System.out.println(a.showInfo() + "\n" + "____________________________________");

            }



            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("All the information has been loaded and accounts are being generated...");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Here's the list of bank accounts that have been created: ");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Would you like to load another file (y/n): ");
        } while(sc.nextLine().equals("y"));





        System.out.println("THANK YOU FOR USING DUOTECH BAM! GOODBYE!");








        System.out.println("THANK YOU FOR USING DUOTECH BMA! GOODBYE!");



    }


}