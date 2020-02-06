public class BaseReceipt implements Receipt{
  private PurchasedItems items;
  private String date;
  
  public BaseReceipt(String date, PurchasedItems items){
    this.items = items;
    this.date = date;
  }
  public void prtReceipt(){
    System.out.println(date + "\n" + items.toString());
  }
}