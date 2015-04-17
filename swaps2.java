package SwapsCalc;
import java.util.Scanner;
public class swaps2 {
	static double pipvalue;
    static double rate;
    static double tradesize;
    static double lotsize;
    static double longrate;
    static double shortrate;
    double pipvaltotal;
    double amountlongswap;
    double amountshortswap;
    
    static Scanner scan = new Scanner(System.in);
       
    //Get Pip Value
    public static void calpipvalue()
    {
    	pipvalue = scan.nextDouble();
    }
       
        
    // Get market rate
        public static void calrate()
        {
             rate = scan.nextDouble();
        }
        //Get Trade Size
        public static void caltradesize()
        {
             tradesize = scan.nextDouble();
        }
        
        //Get Lot Size
        public static void callotsize()
        {
             lotsize = scan.nextDouble();
        }
        
        //Get Long Rate
        public static void callongrate()
        {
             longrate = scan.nextDouble();
        }
        
        //Get Short Rate
        
        public static void calshortrate()
        {
             shortrate = scan.nextDouble();
        }
        public void calcrate()
        {
           
         pipvaltotal= (pipvalue / rate)*tradesize;
         amountlongswap= lotsize * longrate * pipvaltotal;
         amountshortswap = lotsize * shortrate * pipvaltotal;
            
        System.out.println("Your Buy Swap proft  is : " + amountlongswap);
        System.out.println("Your Sell Swap profit is : " + amountshortswap);
        System.out.println("Thankyou Calculation is completed");
     
       

      
        }
}
