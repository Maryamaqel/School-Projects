
package onlinebookstore;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
        // Scanner for input
        Scanner sc = new Scanner(System.in);
        
        // Array to store book names
        String[] bookNames = {
            "The Silent Patient",
            "Harry Potter and The Chamber of Secrets",
            "The Da Vinci Code",
            "The Woman in White",
            "Sherlock Holmes",
            "The Theory of Relativity",
            "The Rudest Book Ever"
        };
        
        // array to store book prices in double
        double[] bookPricesInSar = {
            45.67,
            23.45,
            78.90,
            34.56,
            25.00,
            56.78,
            90.67
        };
        
        // accepting student information
        System.out.println("Enter Student Information:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = sc.nextLine();
        Long.parseLong(phoneNumber);
        System.out.println("Gender (m/f): ");
        char gender = (sc.nextLine()).charAt(0);
        if (Character.toLowerCase(gender) != 'm' && Character.toLowerCase(gender) !='f') {
            throw new Exception();
        }
        System.out.println("ID: ");
        String id = sc.nextLine();
        Integer.parseInt(id);
        System.out.println("Institution: ");
        String institution = sc.nextLine();
        
        // creating object of type Student using the above information
        Student student = new Student(name, phoneNumber, gender, id, institution);
        
        // menu to display book details with price in either SAR or USD
        int c = 0;
        do {
            System.out.println("Press 1 to display books with prices in SAR");
            System.out.println("Press 2 to display books with prices in USD");
            c = sc.nextInt();
            sc.nextLine();
            switch(c) {
                case 1:
                    displayWithPrice(bookNames, bookPricesInSar);
                    break;
                case 2:
                    displayWithPrice(bookNames, bookPricesInSar, c);
                    break;
                default:
                    System.out.println("Invalid Option! Try Again");
            }
        } while(c != 1 && c != 2);
        
        // array to store quantity of books of the book order
        int[] quantity = new int[7];
        
        // accepting book order
        System.out.println("Enter the Sl.No. and the quantity of the book you want.\nYou can keep entering values.\nIf you want to stop, enter -1");
        System.out.println("Enter in this format -> slno quantity, i.e, separated by a white space");
        
        while (true) {
           
                int slno = sc.nextInt();
                if (slno == -1) {
                    break;
                }
                int q = sc.nextInt();
                quantity[slno-1] += q;
        }
       
        
        // printing bill either in SAR or USD
        System.out.println("Bill\n");
        System.out.println("Sl.No.\tBook\t\tPrice\tQuantity");
        if (c == 1) {
            for (int i = 0; i < bookNames.length; i++) {
                if (quantity[i] > 0)
                System.out.println((i + 1) + "\t" + bookNames[i] + "\t" + bookPricesInSar[i] + " SAR\t" + quantity[i]);
            }
            System.out.println("Total Price: " + priceInSar(bookPricesInSar, quantity) + " SAR");
        } else {
            for (int i = 0; i < bookNames.length; i++) {
                if (quantity[i] > 0)
                System.out.println((i + 1) + "\t" + bookNames[i] + "\t" + (bookPricesInSar[i] * 0.27) + " USD\t" + quantity[i]);
            }
            System.out.println("Total Price: " + (priceInSar(bookPricesInSar, quantity) * 0.27) + " USD");
        }

        // Reading the input template and filling details. File Reader and Writer has been used for the same
        try {
            FileWriter fw = new FileWriter("bill_output.txt");
            Scanner read = new Scanner(new FileReader("bill_input.txt"));
            int l = 1;
            while (read.hasNextLine()) {
                String s = read.nextLine();

                switch(l) {
                    case 1:
                    fw.write(s);
                    break;
                    case 2:
                    fw.write(s + student.getName());
                    break;
                    case 3:
                    fw.write(s + student.getPhoneNumber());
                    break;
                    case 4:
                    fw.write(s + student.getGender());
                    break;
                    case 5:
                    fw.write(s + student.getId());
                    break;
                    case 6:
                    fw.write(s + student.getInstitution());
                    break;
                    case 7:
                    fw.write(s);
                    break;
                    case 8:
                    fw.write(s);
                    break;
                }
                fw.write("\n");
                l++;
            }   
            
            if (c == 1) {
                for (int i = 0; i < bookNames.length; i++) {
                    if (quantity[i] > 0) {
                        fw.write((i + 1 ) + "\t" + bookNames[i] + "\t" + bookPricesInSar[i] + " SAR\t" + quantity[i] + "\n");
                    }
                }
                fw.write("\nTotal Price: " + priceInSar(bookPricesInSar, quantity) + " SAR");
            } else {
                for (int i = 0; i < bookNames.length; i++) {
                    if (quantity[i] > 0) {
                        fw.write((i + 1 ) + "\t" + bookNames[i] + "\t" + (bookPricesInSar[i] * 0.27) + " USD\t" + quantity[i] + "\n");
                    }
                }
                fw.write("\nTotal Price: " + (priceInSar(bookPricesInSar, quantity) * 0.27) + " USD");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
         } catch(Exception e) {
            System.out.println("Kindly provide proper input");
            System.exit(0);
        }
    }
    
    // method to calculate bill price in SAR
    public static double priceInSar(double[] bookPricesInSar, int[] quantity) {
        double sum = 0;
        for (int i = 0; i < bookPricesInSar.length; i++) {
            sum += bookPricesInSar[i] * quantity[i];
        }
        return sum;
    }
    
    // overloaded method to display book details with price in SAR
    // concept of polymorphism (method overloading)
    public static void displayWithPrice(String[] bookNames, double[] bookPricesInSar) {
        System.out.println("Sl.No.\tBook Name\t\tPrice");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.println((i+1) + "\t" + bookNames[i] + "\t" + bookPricesInSar[i] + " SAR");
        }
    }
    
    // overloaded method to display book details with price in USD
    // concept of polymorphism (method overloading)
    public static void displayWithPrice(String[] bookNames, double[] bookPricesInSar, int x) {
        System.out.println("Sl.No.\tBook Name\t\tPrice");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.println((i+1) + "\t" + bookNames[i] + "\t" + (bookPricesInSar[i] * 0.27) + " USD");
        }
    }
    
}
