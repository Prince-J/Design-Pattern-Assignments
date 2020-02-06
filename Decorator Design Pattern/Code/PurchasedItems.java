import java.util.*;

public class PurchasedItems{
  private ArrayList<StoreItem> items;
  
  public PurchasedItems(){
    items = new ArrayList<StoreItem>();
  }
  public PurchasedItems(ArrayList<StoreItem> items){
    this.items = items;
  }
  public void addItem(StoreItem newItem){
    items.add(newItem);
  }
  public String toString(){
    ListIterator<StoreItem> itr = items.listIterator();
    String itemsList = "";
    while(itr.hasNext()){
      itemsList += itr.next().toString() + "\n";
    }
    return itemsList;
  }
  public double getTotal(){
    ListIterator<StoreItem> itr = items.listIterator();
    double total = 0.0;
    while(itr.hasNext()){
      total += itr.next().getPrice();
    }
    return total;
  }
}