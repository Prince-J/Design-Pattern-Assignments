/*import java.util.Scanner;
public class UserInterface {

    public void start(){
        String description;
        double value;
        Scanner input = new Scanner(System.in);
        
        int selection;
        String results;
        boolean quit = false;
        
        while(!quit){
            displayMenu();
            selection = getSelection(input);
            
            switch(selection){
                case 1: System.out.println("Enter asset description: ");
                        description = input.nextLine();
                        System.out.println("Enter value of asset: ");
                        value = input.nextDouble();
                        
                        results = SystemInterface.addAsset(description, value);
                        System.out.println(results);
                        break;
                    
                case 2: System.out.println("Enter liability description: ");
                        description = input.nextLine();
                        System.out.println("Enter amount of liability: ");
                        value = input.nextDouble();
                        
                        results = SystemInterface.addLiability(description, value);
                        System.out.println(results);
                        break;    
                        
                case 3: results = SystemInterface.getNetWorth();
                        System.out.println("Net Worth: " + results);
                        break;    
                    
                case 4: quit = true;                        
                        break;   
                    
                default:System.out.println("Invalid Selection");
            }
           
        }
    }
    
    public static void displayMenu(){
        System.out.println("1 - Add Asset");
        System.out.println("2 - Add Liability");
        System.out.println("3 - Display Net Worth");
        System.out.println("4 - Quit");
    }
    
    public static int getSelection(Scanner input){
        int selection;
        
        do{
            System.out.println("Enter: ");
            selection = input.nextInt();
        }
        while (selection < 1 || selection > 4);
        
        input.nextLine();  // scan past end of line
        return selection;
    }
}*/
