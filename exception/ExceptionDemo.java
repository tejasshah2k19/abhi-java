import java.util.*;
//Object 
public class ExceptionDemo {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a,b,ans; 

       try{ 
            System.out.println("Enter two numbers");
            a = scr.nextInt();
            b = scr.nextInt(); 
            ans = a/b; //ArithmeticException 
            System.out.println("Division = "+ans); //
        }catch(ArithmeticException e){
            System.out.println("Please Do not enter zero");
        }catch(InputMismatchException e){
            System.out.println("Please enter only integer-whole numbers");
        }catch(Exception e){
            System.out.println("Something went wrong...");
            //mail(e)
            e.printStackTrace(); 
        }
        finally{
            System.out.println("I will execute any how......");
            //garbadge clean 
            //dbConnection
            //aws connection 
            //NSE - BSE connection 
        }
        System.out.println("===THE END====");
    }
}

