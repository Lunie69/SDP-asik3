package cheremsha;

public class Main {

    public static void main(String[] args) {

        MainCooking traditional = new TraditionalCooking();
        MainCooking modern = new ModernCooking();

        CheremshaDish salad = new CheremshaSalad(traditional);
        CheremshaDish soup = new CheremshaSoup(modern);

        salad.prepare();
        soup.prepare();

        System.out.println();

        System.out.println("Switching cooking method:");

        salad.setCooking(modern);
        salad.prepare();
    }
}