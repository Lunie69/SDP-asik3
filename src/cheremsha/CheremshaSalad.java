package cheremsha;

public class CheremshaSalad extends CheremshaDish {

    public CheremshaSalad(MainCooking cooking) {
        super(cooking);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cheremsha Salad");
        cooking.cook("Cheremsha Salad");
    }
}