import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.Scanner;
public class ProjectElectricityBilling {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double out = 0;
        double x = 0;
        double y = 0;
        double z = 0;
        try {
            System.out.println("Enter 1 for ANDHRA PRADESH Electricity Board:");
            System.out.println("Enter 2 for TELANGANA Electricity Board:");
            int sl = sc.nextInt();
            //sl=select
            if (sl != 1 && sl != 2) {
                System.out.println("Invalid Selection");
            }
            if (sl == 1) {               //AP ELECTRICITY BOARD
                System.out.println("Welcome to Andhra Pradesh Electricity Board");

                System.out.println("Enter 1 for Household: \n" + "Enter 2 for Commercial: ");
                int ch = sc.nextInt();
                if (ch != 1 && ch != 2) {
                    System.out.println("Invalid Choice");
                }

                if (ch == 1) {                //AP Household
                    System.out.println("Please Enter Meter Number:");
                    int meter = sc.nextInt();
                    if (meter > 0 && meter < 11) {

                        System.out.println("Bill per unit if units are consumed less than or eqaul to 100 = 2.5rs");
                        System.out.println("Bill per unit if units are consumed greater than 100 or eqaul to 200 = 3rs");
                        System.out.println("Bill per unit if units are consumed greater 200 = 4rs");
                        System.out.print("Enter the number of units consumed : ");
                        int n = sc.nextInt();


                        if (n <= 100) {
                            out = n * 2.5;
                            System.out.println("Electricity Bill of meter " + meter + " is :" +" "+ out + "rs");
                        } else if (n > 100 && n <= 200) {
                            out = n * 3.0;
                            System.out.println("Electricity Bill of meter " + meter + " is :" +" "+ out + "rs");
                        } else if (n > 200) {
                            out = n * 4.0;
                            System.out.println("Electricity Bill of meter " + meter + " is :" +" "+ out + "rs");
                        } else
                            System.out.println("Inavalid Input");
                        FileWriter ob1 = new FileWriter("C:\\Users\\Purna Sai\\OneDrive\\Desktop\\APHOUSEHOLD.txt", true);
                        String w = "\n" + "Electricity bill of meter number" + " " + meter + " is " + out + "Rs";
                        ob1.write(w);
                        ob1.close();
                    } else {
                        System.out.println("Please check and enter valid meter number");
                    }


                } else if (ch == 2) {         //AP Commercial
                    System.out.println("Please Enter Meter Number:");
                    int Meter = sc.nextInt();
                    if (Meter > 0 && Meter < 11) {

                        System.out.println("Bill per unit if units are consumed less than or eqaul to 200 = 5rs");
                        System.out.println("Bill per unit if units are consumed greater than 200 or eqaul to 300 = 7rs");
                        System.out.println("Bill per unit if units are consumed greater 300 = 10rs");
                        System.out.print("Enter the number of units consumed : ");
                        int n = sc.nextInt();

                        if (n <= 200) {
                            //a=n*2.5;
                            //System.out.println("Bill is : "+a);
                            x = n * 5.0;
                            System.out.println("Electricity Bill of Meter " + Meter + " is :" +" "+ x + "rs");
                        } else if (n > 200 && n <= 300) {
                            x = n * 7.0;
                            System.out.println("Electricity Bill of Meter " + Meter + " is :" +" "+ x + "rs");
                        } else if (n > 300) {
                            x = n * 10.0;
                            System.out.println("Electricity Bill of Meter " + Meter + " is :" +" "+ x + "rs");
                        } else
                            System.out.println("Invalid input");
                        FileWriter ob2 = new FileWriter("C:\\Users\\Purna Sai\\OneDrive\\Desktop\\APCOMMERCIAL.txt", true);
                        String w = "\n" + "Electricity bill of meter number" + " " + Meter + " is " + x + "Rs";
                        ob2.write(w);
                        ob2.close();

                    } else {
                        System.out.println("Please check and enter valid meter number");
                    }

                }

            } else if (sl == 2) {              //TS ELECTRICITY BOARD
                System.out.println("Welcome to Telangana Electricity Board");

                System.out.println("Enter 1 for HouseHold Electricity:");
                System.out.println("Enter 2 for  Commercial Electricity:");
                int pr = sc.nextInt();
                //pr=press
                if (pr != 1 && pr != 2) {
                    System.out.println("Invalid press");
                }
                if (pr == 1) {
                    System.out.println("Please Enter Meter Number:");
                    int MeterNumber = sc.nextInt();
                    if (MeterNumber > 0 && MeterNumber < 11) {

                        System.out.println("Bill per unit if units are consumed less than or eqaul to 100 = 2rs");
                        System.out.println("Bill per unit if units are consumed 100 than or eqaul to 200 = 2.5rs");
                        System.out.println("Bill per unit if units are consumed greater than  200 = 3rs");
                        System.out.println("Enter The Number of Units Consumed :");
                        int m = sc.nextInt();

                        if (m <= 100) {
                            y = m * 2;
                            System.out.println("Electricity Bill of Meter " + MeterNumber + " is :" +" "+ y + "rs");
                        } else if (m > 100 && m <= 200) {
                            y = m * 2.5;
                            System.out.println("Electricity Bill of Meter " + MeterNumber + " is :" +" "+ y + "rs");
                        } else if (m > 200) {
                            y = m * 3;
                            System.out.println("Electricity Bill of Meter " + MeterNumber + " is :" +" "+ y + "rs");
                        } else
                            System.out.println("Invalid Input");
                        FileWriter ob3 = new FileWriter("C:\\Users\\Purna Sai\\OneDrive\\Desktop\\TSHOUSEHOLD.txt", true);
                        String w = "\n" + "Electricity bill of meter number" + " " + MeterNumber + " is " + y + "Rs";
                        ob3.write(w);
                        ob3.close();

                    } else {
                        System.out.println("Please check and enter valid meter number");
                    }
                } else if (pr == 2)                       //TS commercial
                {
                    System.out.println("Please Enter Meter Number:");
                    int Meternumber = sc.nextInt();
                    if (Meternumber > 0 && Meternumber < 11) {

                        System.out.println("Bill per unit if units are consumed are less than or eqaul to 200 = 4rs");
                        System.out.println("Bill per unit if units are consumed are greater than 200 or eqaul to 300 = 6rs");
                        System.out.println("Bill per unit if units are consumed are greater 300 = 8rs");
                        System.out.println("Enter The Number of Units Consumed:");
                        int m = sc.nextInt();

                        if (m <= 200) {
                            z = m * 4;
                            System.out.println("Electricity Bill of meter " + Meternumber + " is :" +" "+ z + "rs");
                        } else if (m > 200 && m <= 300) {
                            z = m * 6;
                            System.out.println("Electricity Bill of meter " + Meternumber + " is :" +" "+ z + "rs");
                        } else if (m > 300) {
                            z = m * 8;
                            System.out.println("Electricity Bill of meter " + Meternumber + " is :" +" "+ z + "rs");
                        } else
                            System.out.println("Invalid Input");
                        FileWriter ob4 = new FileWriter("C:\\Users\\Purna Sai\\OneDrive\\Desktop\\TSCOMMERCIAL.txt", true);
                        String w = "\n" + "Electricity bill of meter number" + " " + Meternumber + " is " + z + "Rs";
                        ob4.write(w);
                        ob4.close();
                    } else {
                        System.out.println("Please check and enter valid Meter number");
                    }
                }
            }
            System.out.println("Do you want to print all the bills of all meters");
        System.out.println("Enter 1 to display");
        System.out.println("Enter 2 to exit");
        int t = sc.nextInt();
        if (t == 1) {
            System.out.println("Enter 1 to print APHOUSEHOLD BILLS");
            System.out.println("Enter 2 to print APCOMMERCIAL BILLS");
            System.out.println("Enter 3 to print TSHOUSEHOLD BILLS");
            System.out.println("Enter 4 to print TSCOMMERCIAL BILLS");
            int d = sc.nextInt();

            if (d == 1) {
                Path APHOUSEHOLD = Path.of("C:\\Users\\Purna Sai\\OneDrive\\Desktop\\APHOUSEHOLD.txt");
                String str = Files.readString(APHOUSEHOLD);
                System.out.println(str);

            } else if (d == 2) {
                Path APCOMMERCIAL = Path.of("C:\\Users\\Purna Sai\\OneDrive\\Desktop\\APCOMMERCIAL.txt");
                String str = Files.readString(APCOMMERCIAL);
                System.out.println(str);

            } else if (d == 3) {
                Path TSHOUSEHOLD = Path.of("C:\\Users\\Purna Sai\\OneDrive\\Desktop\\TSHOUSEHOLD.txt");
                String str = Files.readString(TSHOUSEHOLD);
                System.out.println(str);

            } else if (d == 4) {

                Path TSCOMMERCIAL = Path.of("C:\\Users\\Purna Sai\\OneDrive\\Desktop\\TSCOMMERCIAL.txt");
                String str = Files.readString(TSCOMMERCIAL);
                System.out.println(str);
            } else {
                System.out.println("Enter valid input");
            }
        }
        else if (t == 2) {
            System.out.println("Exited Successfully");
        }
        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers only");
        }
    }
}
