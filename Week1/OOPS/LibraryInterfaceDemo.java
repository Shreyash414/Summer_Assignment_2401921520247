package Week1.OOPS;
import java.util.*;

public class LibraryInterfaceDemo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("How you want to get registered as (1 -> Kid/ 2 -> Adult):");
        int choice= sc.nextInt();
        if(choice==1){
            KidUsers kiddo= new KidUsers();
            System.out.println("Please enter your age:");
            kiddo.age=sc.nextInt();
            kiddo.registerAccount(kiddo.age);
            if(kiddo.valid==true){
                System.out.println("Please enter your book category (Fiction/Kid)");
                kiddo.bookType=sc.next();
                kiddo.requestBook(kiddo.bookType);
            }
        }
        else if(choice==2){
            AdultUser adult= new AdultUser();
            System.out.println("Please enter your age:");
            adult.age= sc.nextInt();
            adult.registerAccount(adult.age);
            if(adult.valid==true){
                System.out.println("Please enter your book category (Fiction/Kid)");
                adult.bookType=sc.next();
                adult.requestBook(adult.bookType);
            }



        }

        else{
            System.out.println("Invalid choice");
        }
    }
}
