/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Milk implements Beverage {
    private Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "milk ";
    }
}
