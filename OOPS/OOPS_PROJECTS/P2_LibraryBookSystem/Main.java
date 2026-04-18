package OOPS.OOPS_PROJECTS.P2_LibraryBookSystem;
public class Main {
    public static void main(String[] args) {
        Book[] lib = new Book[3];

    lib[0] = new Book("Java", 101, false);
    lib[1] = new Book("Python", 102, true);
    lib[2] = new Book("C++", 103, false);

    for (Book b : lib) {
        b.printBook();
    
    }
    }
}
