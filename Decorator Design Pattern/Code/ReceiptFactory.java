public class ReceiptFactory {
  Receipt receipt;
  private TaxComputationMethod taxComputation;
  private AddOn[] addOns;
  
  public ReceiptFactory(){
    // read config file and determine which TaxComputation object to assign to 
    //
    if(stateCode.equals("MD"))
      taxComputation = new MDTaxComputation();
    else if(statecode.equals("CA"))
      taxComputation = new CATaxComputation();
    else
      taxComputation = new MATaxComputation();    
    
    addOns = new AddOn[10];
    for (int i = 0; i < addOns.length; i++)
      addOns[i] = null;
    
    // hard code here the current available decorators
    addOns[0] = new SecondaryHeader("* Happy Holidays *");
    addOns[1] = new Coupon100();  // hard coded to provides lines of text for the coupon to be added to the receipt, if spend over $100
    addOns[2] = new Coupon250();  // hard coded to provides lines of text for the coupon to be added to the receipt, if spend over $250
    addOns[3] = new Rebate1304(); // hard coded to provides lines of text for item 1304, if in purchasedItems
    
  }
  /*
   * Type Casting??
   * Receipt r;
   * r = new BasicReceipt(_,_);
   * ((BasicReceipt)r).setTaxComputation(...);
   * */
  
  public void getReceipt(PurchasedItems items, String date) {
    // Create basic receipt
    receipt = new BaseReceipt(purchasedItems, date);
    
    receipt.setTaxComputation(taxComputation);
    for(int i = 0; i < addOns.length; i++){
      if(addOns[i].applies(purchasedItems)){
        if(addOns[i].getType() ==2){
          receipt = new PostDecorator(receipt, addOns[i]);
        }else{
          receipt = new PreDecorator(receipt, addOns[i]);
        }
      }
    }
    // check for any decorators to add to the receipt
    // if a given decorator applies, then construct either
    // a PreDecorator or PostDecorator with that AddOn object
    // and link in
  }
}
  