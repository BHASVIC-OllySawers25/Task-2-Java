public class Manager {
	private String name;
	
    Manager(String name) {
        this.name = name;
    }
    public void takeFeedback(Manager curManager, Customer customer) {
        if (customer.feedback > 0)
            System.out.println(curManager.name + " says: " + customer.name + " was happy with their stay!");
        else if (customer.feedback < 0)
            System.out.println(curManager.name + " says: " + customer.name + " was unhappy with their stay!");
        else
            System.out.println(curManager.name + " says: " + customer.name + " found their stay ok.");
    }
}