public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }
    public void wypiszInfo() {
        System.out.println("Tytul: " + tytul + ", Autor: " + autor + ", Stron: " + liczbaStron + ", Dostepna: " + dostepna);
    }

    public void  wyporzycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Książka '" + tytul + "' została wypożyczona.");
        }
        else {
            System.out.println("Książka '" + tytul + "' jest niedostępna.");
        }
    }

    public void zwroc() {
        dostepna = true;
        System.out.println("Książka '" + tytul + "' została zwrócona.");
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}