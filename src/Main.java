import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<>();

        sehirler.add("İzmir");
        sehirler.add("Ankara");
        sehirler.add("İstanbul");

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }
    }
}
