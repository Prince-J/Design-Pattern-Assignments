public class MDTaxComputation extends TaxComputationMethod { 
  private PurchasedItems items;
  private Date date;
  public double computeTax(PurchasedItems items, Date date) { 
// calls private method taxHoliday as part of this computation } 
    double tax = 0.0;
    //boolean taxHoliday(ReceiptDate date);
// returns true if date of receipt within the state’s tax free holiday, 
// else returns false. Supporting method of method computeTax.
    return tax;
  } 
  public boolean taxHoliday(){
    Date holidayStart = new Date();
    Date holidayEnd = new Date();
    if (date.after(holidayStart) && date.before(holidayEnd)){
      return true;
    }
    return false;
  } 
  // tax computation objects for other states are similar
}