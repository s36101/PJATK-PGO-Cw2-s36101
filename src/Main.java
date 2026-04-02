public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka(5);
        Czytelnik czytelnik = new Czytelnik("Artur", "Tomala", 36101);

        biblioteka.dodajKsiazke(new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 320, true));
        biblioteka.dodajKsiazke(new Ksiazka("Solaris", "Stanisław Lem", 250, true));

        System.out.println("--- Dostępne książki ---");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("--- Wypożyczanie ---");
        biblioteka.wypozyczKsiazke("Solaris", czytelnik);
        czytelnik.wypiszDane();

        System.out.println("--- Po wypożyczeniu");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("--- Zwrot ---");
        biblioteka.zwrocKsiazke("Solaris", czytelnik);
        czytelnik.wypiszDane();
    }
}