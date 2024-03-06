package gestionbiblio;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Livres {

    public String title;
    public Category category;
    public ArrayList<Copy> copies;

    public Livres() {
        this.title = "None";
        this.copies = new ArrayList<>();
    }

    public Livres(String title, Category category) {
        this.title = title;
        this.category = category;
        this.copies = new ArrayList<>();
    }
    
}
