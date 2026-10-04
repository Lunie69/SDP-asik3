package cheremsha;

public class CheremshaSoup extends CheremshaDish {

    public CheremshaSoup(MainCooking cooking) {
        super(cooking);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cheremsha Soup");
        cooking.cook("Cheremsha Soup");
    }
}