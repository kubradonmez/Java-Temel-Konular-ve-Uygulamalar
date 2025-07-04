import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // HashSet oluştur
        HashSet<String> meyveler = new HashSet<>();

        // Aynı elemanları eklemeye çalış
        meyveler.add("elma");
        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("kiraz");

        // Tüm elemanları ekrana yazdır
        for (String meyve : meyveler) {
            System.out.println(meyve);
        }
    }
}
