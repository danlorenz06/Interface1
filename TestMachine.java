

public class TestMachine {
	public static void main(String[]args) {
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person(2);
		
		person.insertCoin(gumballMachine, 3);
		person.insertCoin(gumballMachine, 3);
	
		}

}
