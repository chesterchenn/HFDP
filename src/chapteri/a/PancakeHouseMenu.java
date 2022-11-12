package chapteri.a;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList<MenuItem> menuItems;

  public PancakeHouseMenu() {
    menuItems = new ArrayList<MenuItem>();
    addItem("K&B", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Regular", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry", "Pancakes with fresh blueberries", true, 3.49);
    addItem("Waffles", "Waffles", true, 3.59);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  //  public ArrayList<MenuItem> getMenuItems() {
  //    return  menuItems;
  //  }

  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
}
