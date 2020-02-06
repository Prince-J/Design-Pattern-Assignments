public class SecondaryHeader implements SecondaryHeading{
  private String message;
  private int type = 1;
  public SecondaryHeader(String message){
    this.message = message;
  }
  public boolean applies(PurchasedItems items){
    return true;
  }
  public int getType(){
    return type;
  }
  public String getLines(){
    return message;
  }
  
}