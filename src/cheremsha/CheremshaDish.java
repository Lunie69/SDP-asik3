package cheremsha;

public abstract class CheremshaDish {

    protected MainCooking cooking;

    public CheremshaDish(MainCooking cooking) {
        this.cooking = cooking;
    }

    public void setCooking(MainCooking cooking) {
        this.cooking = cooking;
    }

    public abstract void prepare();
}