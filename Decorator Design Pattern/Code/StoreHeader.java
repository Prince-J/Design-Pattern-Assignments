public class StoreHeader{
  private String streetAddress;
  private String stateCode;
  private String zipCode;
  private String phoneNumber;
  private String storeNumber;
  public StoreHeader(String street_addr, String zip_code, String state_code, String phone_num, String store_num) { 
    streetAddress = street_addr;
    stateCode = state_code;
    zipCode = zip_code;
    phoneNumber = phone_num;
    storeNumber = store_num;
  } 
  public String getStateCode() { 
    return stateCode;
  } 
  public String toString() { 
   String storeHeader = "BEST BUY " + storeNumber + "\n" + streetAddress + 
     " " + stateCode + " " + zipCode + " " + phoneNumber;
   
   return storeHeader;
  } 
}