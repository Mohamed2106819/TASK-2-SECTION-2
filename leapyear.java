//Task 2, no3 
package leapyear;
import java.util.Scanner;
public class leapyear {
    public static void main(String[]args){
         
        class year{
            public static void leap(){
                year.leap();
            }
        }
int year;
System.out.println("enter year");
Scanner input=new Scanner(System.in);
year=input.nextInt();

if((year%4)==0){
    System.out.println("Is a leap year");

    
}
else{
    System.out.println("it is not a leap year");
}

            }
        }
    
    

