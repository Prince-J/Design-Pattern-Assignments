public class CMDSubmitOrder{
  private Aggregator agg;
  private OrderItem orderItem;
  
  public CMDSubmitOrder(Aggregator agg,OrderItem orderItem){
    this.agg = agg;
    this.orderItem = orderItem;
  }
  
  public String execute(){
    return "Order Done";
  }
}