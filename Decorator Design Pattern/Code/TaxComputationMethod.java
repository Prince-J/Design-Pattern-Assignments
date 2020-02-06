public abstract class TaxComputationMethod { 
  public abstract double computeTax(PurchasedItems items, Date date); 
  public abstract boolean taxHoliday(); 
} 