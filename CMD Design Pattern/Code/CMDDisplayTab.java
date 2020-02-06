public class CMDDisplayTab{
  private Aggregator agg;
  
  public CMDDisplayTab(Aggregator agg){
    this.agg = agg;
  }
  
  public String execute(){
    return "tab";
  }
}