class StoreItem{
  private String itemCode;
  private String itemName;
  private double itemPrice;
  
  public StoreItem(String itemCode, String itemName, double itemPrice){
    this.itemCode = itemCode;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }
  public double getPrice(){
    return itemPrice;
  }
  public String toString(){
    return itemCode + " " + itemName + ".............. $" + itemPrice;
  }
}