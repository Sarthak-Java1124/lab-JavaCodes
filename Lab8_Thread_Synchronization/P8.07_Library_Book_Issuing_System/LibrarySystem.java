class Library {
    String bookTitle;
    private final int totalCopies;
    private int issuedCopies = 0;

    Library(String bookTitle, int totalCopies) {
        this.bookTitle = bookTitle;
        this.totalCopies = totalCopies;
    }

    synchronized void issueBook(String student) {
        if (issuedCopies < totalCopies) {
            issuedCopies++;
            System.out.println("'" + bookTitle + "' issued to " + student
                    + ". Copies left: " + (totalCopies - issuedCopies));
        } else {
            System.out.println("Sorry " + student + ", no copies of '" + bookTitle
                    + "' are available.");
        }
    }

    int getIssuedCopies() {
        return issuedCopies;
    }
}

class StudentThread extends Thread {
    Library library;

    StudentThread(Library library, String name) {
        super(name);
        this.library = library;
    }

    public void run() {
        library.issueBook(getName());
    }
}

public class LibrarySystem {
    public static void main(String[] args) throws InterruptedException {
        Library library = new Library("Head First Java", 3);
        System.out.println("Available copies: 3");

        String[] names = { "Ananya", "Vikram", "Meera", "Karan", "Isha" };
        StudentThread[] students = new StudentThread[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new StudentThread(library, names[i]);
            students[i].start();
        }
        for (StudentThread s : students) s.join();

        System.out.println("Total copies issued: " + library.getIssuedCopies());
    }
}
