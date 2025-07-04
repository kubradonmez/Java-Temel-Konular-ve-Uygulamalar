import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // HashMap oluştur
        HashMap<String, Integer> notlar = new HashMap<>();

        // Öğrenci ve notları ekle
        notlar.put("Ahmet", 90);
        notlar.put("Ayşe", 85);
        notlar.put("Mehmet", 75);

        // Tüm öğrencileri ve notlarını yazdır
        for (Map.Entry<String, Integer> entry : notlar.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
