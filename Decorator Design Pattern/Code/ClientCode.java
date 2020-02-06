public class ClientCode{
  public static void main(String[]args){
    PurchasedItems itemList = new PurchasedItems();
    StoreItem newItem = new StoreItem("7076", "Mouse", 5.00);
    itemList.addItem(newItem);
    newItem = new StoreItem("4529", "Keyboard", 5.00);
    itemList.addItem(newItem);
    
    String itemsBought = itemList.toString();
    System.out.print(itemsBought);
  }
  // 1. Creates a Data object (either from Java API or date entered by user) // 2. Creates a PurchasedItems object (selections made by user) // 3. Constructs a ReceiptFactory object. // 3. Prompts user for items to purchase, storing each in PurchasedItems. // 4. Calls the getReceipt method of the factory to obtain constructed receipt. // 5. Prints receipt by call to method prtReceipt. 
  
// get receipt date // (prompt user for current date) 
  
// display all available store items to user (to be implemented) 
  
// get all user selections (to be implemented) 
  
  //ReceiptFactory factory = new ReceiptFactory(); 
  //Receipt = factory.getReceipt(items, date); 
  //receipt.prtReceipt(); 
}