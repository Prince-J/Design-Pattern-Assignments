import java.util.*;

public class Orders{
   private ArrayList<OrderItem> orders;
   
   public Orders(){
     orders = new ArrayList<OrderItem>(10);
   }
   
   public void add(OrderItem orderItem){
     orders.add(orderItem);
   }
   
   public void listIterator(){
     return new ListIterator<Orders>;
   }
}