import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList oluştur
        ArrayList<Integer> sayilar = new ArrayList<>();

        // Sayıları ekle
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        // Lambda ile forEach kullanarak yazdır
        sayilar.forEach(sayi -> System.out.println(sayi));
    }
}
