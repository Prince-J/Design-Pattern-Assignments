public class MenuItem{
  private String itemName;
  private double price;
  
  public MenuItem(String itemName, double price){
    this.itemName = itemName;
    this.price = price;
  }
  
  public double getPrice(){
    return price;
  }
  
  public String toString(){
    return itemName + "    $" + price;
  }
}