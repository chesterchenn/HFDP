package chapteri.a;

public class DinerMenu {
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("Soup of the day", "With a side of potato salad", false, 3.29);
    addItem("Hot dog", "A hot dog", false, 3.05);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems >= MAX_ITEMS) {
      System.err.println("Sorry, menu is full! Can't add item to menu");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }

  //  public MenuItem[] getMenuItems() {
  //    return menuItems;
  //  }

  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
