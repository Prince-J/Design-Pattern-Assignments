public class Rebate1304 implements Rebate{
  private String lines;
  private int type = 2;
  public Rebate1304(){
    lines = "BEST BUY COUPON \t10% off next purchase \nGood until 12/31/2019 ";
  }
  public boolean applies(PurchasedItems items){
    if(items.getTotal() >= 100.0)
      return true;
    return false;
  }
  public int getType(){
    return type;
  }
  public String getLines(){
    return lines;
  }
}

/*$10  REBATE   Item 1304 Samsung S9 Case 
 
Mail ORIGINAL receipt and Proof of Purchase from package to: BEST BUY / SAMSUNG REBATES 1000 Industry Way Owings Mills, MD 21117 
 
Please allow 3-4 weeks for processing 
*/