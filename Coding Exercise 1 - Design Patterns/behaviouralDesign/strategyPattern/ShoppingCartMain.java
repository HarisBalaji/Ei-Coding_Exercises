package behaviouralDesign.strategyPattern;

public class ShoppingCartMain {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",25);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		System.out.println("Bought two items with price 25 and 40.");
		
		//pay by GPay
		cart.pay(new GooglePayStrategy("haris@gmail.com", "mypwd"));
		
		cart.removeItem(item1);
		cart.removeItem(item2);

		Item item3 = new Item("2004",50);
		Item item4 = new Item("3006",60);
		
		cart.addItem(item3);
		cart.addItem(item4);
		System.out.println("Bought two items with price 50 and 60.");

		//pay by credit card
		cart.pay(new CreditCardStrategy("Haris Balaji", "1234567890123456", "786", "12/25"));
	}

}
