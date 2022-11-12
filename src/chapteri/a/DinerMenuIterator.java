package chapteri.a;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items;
  int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  @Override
  public Object next() {
    return items[position++];
  }

  @Override
  public boolean hasNext() {
    return items.length > position;
  }
}
