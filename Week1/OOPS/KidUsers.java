package Week1.OOPS;

public class KidUsers implements LibraryUser {

    int age;
    String bookType;
    @Override
    public void registerAccount(int Age) {
        if (Age<12){
            System.out.println("You have successfully registered under kids account");
        }

    }

    @Override
    public void requestBook(String BookType) {

    }
}
