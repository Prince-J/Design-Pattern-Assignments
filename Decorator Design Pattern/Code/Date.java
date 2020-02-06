public class Date{
  private int day;
  private int month;
  private int year;
  
  public Date(){
    day = 01;
    month = 01;
    year = 2019;
  }
  public Date(int m, int d, int y){
    day = d;
    month = m;
    year = y;
  }
  public boolean after(Date d){
    return true;
  }
    public boolean before(Date d){
    return true;
  }
}