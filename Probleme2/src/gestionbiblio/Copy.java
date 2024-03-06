package gestionbiblio;


public class Copy extends Livres {
    boolean state;
    int nb;
    private static int lastId = 0;
    private int id;

    public Copy() {
        this.id = lastId ++;
    }

    // Nouveau constructeur pour créer une copie à partir d'un livre sans incrémenter l'ID
    public Copy(Livres bk) {
        this.id = ++lastId;
        this.nb = nb;
        this.title = bk.title;
        this.category = bk.category;
        this.state = true; // On suppose que initialement tous les exemplaires sont disponibles
        bk.copies.add(this);
    }

    public int getId() {
        return id;
    }

    public boolean isEmprunte() {
        // TODO Auto-generated method stub
        return false;
    }
}
