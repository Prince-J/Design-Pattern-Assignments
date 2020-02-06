import java.util.*;

public class Tab{
  private Orders orders;
  private Menu menu;
  
  public Tab(Orders orders, Menu menu){
    this.orders = orders;
    this.menu = menu;
  }
  
  public String getTab(){
    String totalTab = "";
    double totalPrice = 0.0;
    ListIterator<Orders> itr = orders.listIterator(); 
    for(int current = 0; orders.hasNext(); current ++){
      totalTab += menu.get(orders.next()).toString() + "\n";
    }
  }
}