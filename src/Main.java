public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski" ,320, true);
        Ksiazka k2 = new Ksiazka("Lalka" ,"Bolesław Prus" ,680, false);

        k1.wypiszInfo();
        k1.wyporzycz();
    }
}