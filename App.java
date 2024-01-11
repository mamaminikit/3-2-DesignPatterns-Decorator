/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class App {
	public static void main(String[] args) {
		Beverage plainBeverage = new Sugar(new Sugar(new Milk(new PlainBeverage())));
		System.out.println("You order " + plainBeverage.getDescription());
		System.out.println("The cost is " + plainBeverage.getCost());
	}
}
