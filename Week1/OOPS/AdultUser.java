package Week1.OOPS;

public class AdultUser implements LibraryUser{
    int age;
    String bookType;
    boolean valid=false;
    @Override
    public void registerAccount(int Age) {
        if (Age>12){
            System.out.println("You have successfully registered under adult account");
            valid=true;
        }
        else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }

    }

    @Override
    public void requestBook(String BookType) {
        if(BookType.equals("Fiction") || BookType.equals("fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
