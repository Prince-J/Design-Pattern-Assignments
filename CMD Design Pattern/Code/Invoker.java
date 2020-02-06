public class Invoker {
    
    Aggregator agg;
    
    public Invoker(Aggregator agg){
        this.agg = agg;
    }
    
    public String displayMenu(Menu menu){
        return new CMDDisplayMenu(agg, menu).execute();
    }
    
    public String submitOrder(OrderItem orderItem){
        return new CMDSubmitOrder(agg, orderItem).execute();
    }
    
    public String displayTab(){
        return new CMDDisplayTab(agg).execute();
    }
    //NOTE: Java will use unboxing here, and convert Object Double type
    //      to primitive double (as required by the return type of this
    //      method.
}
