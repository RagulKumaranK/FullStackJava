package OOPS.OOPS_PROJECTS.P2_LibraryBookSystem;
public class Book {
    String bookName;
    int bookCode;
    Boolean takenOrNot;
    Book(String bookName, int bookCode, Boolean takeOrNot){
        this.bookName =bookName;
        this.bookCode =bookCode;
        this.takenOrNot=takeOrNot;
    }
    public void printBook(){
        System.out.println("BookName :"+bookName+"| Bookcode :"+bookCode+" | Current Status :"+takenOrNot);
    }
}
