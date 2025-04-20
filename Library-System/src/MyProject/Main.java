package MyProject;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        int quantity =0;
        ArrayList<Book> library = new ArrayList<>();
        Scanner myobj = new Scanner(System.in);
        while(true){
        System.out.println("== MENU ==");
        System.out.println("1 - register a new book");
        System.out.println("2 - Listing all book's");
        System.out.println("3 - Search a book by tittle");
        System.out.println("4 - Remove a book by tittle");
        System.out.println("5 - Exit");
        System.out.println("chose an option: ");
        int option = myobj.nextInt();
        switch (option) {
            case 1:
                System.out.println("how much book you wanna register? ");
                int amount = myobj.nextInt();
                quantity += amount;
                myobj.nextLine();
                for (int i = 0; i < amount; i++) {
                    System.out.println("Name of " + (i+1) + "° book");
                    System.out.println("Enter the year: ");
                    int year = myobj.nextInt();
                    myobj.nextLine();
                    System.out.println("Enter the tittle: ");
                    String tittle = myobj.nextLine();
                    System.out.println("Enter the author: ");
                    String author =myobj.nextLine();
                    library.add(new Book(tittle, author, year));
                }
                break;
            case 2:
                for (Book b : library) {
                    System.out.println("Tittle: " + b.getTittle());
                    System.out.println("Author: " + b.getAuthor());
                    System.out.println("Year: " + b.getYear());
                }
                break;
            case 3:
                myobj.nextLine();
                System.out.println("Wanna the name of book you wanna search? ");
                String search = myobj.nextLine();
                boolean found = false;
                for (Book b : library) {
                    if (b.getTittle().equalsIgnoreCase(search)) {
                        System.out.println("\nbook found:");
                        System.out.println("Tittle: " + b.getTittle());
                        System.out.println("Author: " + b.getAuthor());
                        System.out.println("Year: " + b.getYear());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("book not found");
                }
                break;
            case 4:
                myobj.nextLine();
                System.out.println("\nenter the tittle of the book to remove: ");
                String searchRemove = myobj.nextLine();
                boolean removed = false;
                for (int i = 0; i < library.size(); i++) {
                    if (library.get(i).getTittle().equalsIgnoreCase(searchRemove)) {
                        library.remove(i);
                        removed = true;
                        System.out.println("\nbook removed successfully");
                        break;
                    }
                }
                if (!removed) {
                    System.out.println("\nbook not found");
                }
                break;
            case 5:
                return;
            default:
                System.out.println("insert a valid option");
        }
        }
    }
}