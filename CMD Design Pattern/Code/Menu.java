import java.util.*;

public class Menu{
   private ArrayList<MenuItem> menu;
   public Menu(){
     menu = new ArrayList<MenuItem>(10);
   }
   public void add(MenuItem menuItem){
     menu.add(menuItem);
   }
}