class Printer {
    synchronized void printDocument(String user, String document, int pages) {
        System.out.println(user + " started printing '" + document + "'");
        for (int i = 1; i <= pages; i++) {
            System.out.println("  " + user + " - page " + i + " of " + pages);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(user + " finished printing '" + document + "'");
    }
}

class PrintJob extends Thread {
    Printer printer;
    String document;
    int pages;

    PrintJob(Printer printer, String user, String document, int pages) {
        super(user);
        this.printer = printer;
        this.document = document;
        this.pages = pages;
    }

    public void run() {
        printer.printDocument(getName(), document, pages);
    }
}

public class SharedPrinter {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        PrintJob j1 = new PrintJob(printer, "User-1", "Report.pdf", 3);
        PrintJob j2 = new PrintJob(printer, "User-2", "Resume.docx", 2);
        PrintJob j3 = new PrintJob(printer, "User-3", "Notes.txt", 2);

        j1.start();
        j2.start();
        j3.start();
        j1.join();
        j2.join();
        j3.join();

        System.out.println("All print jobs completed.");
    }
}
