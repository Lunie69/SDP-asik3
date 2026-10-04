package cheremsha;

public class TraditionalCooking implements MainCooking {

    @Override
    public void cook(String dishName) {
        System.out.println("Traditional cooking: " + dishName);
    }
}