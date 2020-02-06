public class Coupon100 implements Coupon{
  private String lines;
  private int type = 2;
  public Coupon100(){
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