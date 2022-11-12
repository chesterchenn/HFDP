package chapteri.a;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
  ArrayList<MenuItem> menuItems;
  int position = 0;

  public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public Object next() {
    return menuItems.get(position++);
  }

  @Override
  public boolean hasNext() {
    return menuItems.size() > position;
  }
}
