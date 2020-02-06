public class CMDDisplayMenu{
  private Aggregator agg;
  private Menu menu;
  
  public CMDDisplayMenu(Aggregator agg, Menu menu){
    this.agg = agg;
    this.menu = menu;
  }
  
  public String execute(){
    return "menu";
  }
}