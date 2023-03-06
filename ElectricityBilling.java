import java.util.*;
public class ElectricityBilling {
    public static void main(String[] args) {
        System.out.println("Bill per unit if units are consumed less than or eqaul to 100 = 2.5rs");
        System.out.println("Bill per unit if units are consumed greater than 100 or eqaul to 200 = 3rs");
        System.out.println("Bill per unit if units are consumed greater 200 = 4rs");
        System.out.print("Enter the number of units consumed : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//double a,b;

//System.out.print(n);
        if(n<= 100)
        {
            //a=n*2.5;
            //System.out.println("Bill is : "+a);
            System.out.println("Bill is : "+n*2.5+"rs");
        }
        else if(n>100&&n<=200){
            System.out.println("Bill is :"+n*3.0+"rs");
        }
        else if(n>200)
            System.out.println("Bill is :"+n*4.0+"rs");
        else
            System.out.println("Inavalid Input");
    }
}