public class Main {
    public static void main(String[] args) {
        // 1. int değişken oluştur ve değer ata
        int sayi = 42;

        // 2. Autoboxing: int → Integer
        Integer sayiNesne = sayi;

        // 3. Unboxing: Integer → int
        int sayiTekrar = sayiNesne;

        // 4. Hepsini ekrana yazdır
        System.out.println("int değişken: " + sayi);
        System.out.println("Integer nesne: " + sayiNesne);
        System.out.println("Tekrar int: " + sayiTekrar);
    }
}
