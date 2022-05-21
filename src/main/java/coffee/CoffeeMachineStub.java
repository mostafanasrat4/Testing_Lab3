package coffee;

public class CoffeeMachineStub {
    public void addMilk(int i){
        System.out.println("Added Milk");
    }
    public void addBeans(int i){
        System.out.println("Added Beans");
    }
    public void addWater(int i){
        System.out.println("Added Water");
    }
    public void addChocolate(int i){
        System.out.println("Added Chocolate");
    }
    public boolean useMilk(){
        System.out.println("Used Milk");
        return true;
    }
    public boolean useBeans(){
        System.out.println("Used Beans");
        return true;
    }
    public boolean useWater(){
        System.out.println("Used Water");
        return true;
    }
    public boolean useChoco(){
        System.out.println("Used Chocolate");
        return true;
    }
}