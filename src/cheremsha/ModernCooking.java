package cheremsha;

public class ModernCooking implements MainCooking {

    @Override
    public void cook(String dishName) {
        System.out.println("Modern cooking: " + dishName);
    }
}