
package SwapsCalc;
import java.util.Scanner;

public class swapsmain {

	public static void main(String[] args) {
		System.out.println("Welcome to Swaps Rate Calculator");
        swaps2 Calculator = new swaps2();
        
        System.out.println("Please enter Pip Value:");
        swaps2.calpipvalue();
        System.out.println("Please enter Market Rate:");
        swaps2.calrate();
        System.out.println("Please enter Trade Size:");
        swaps2.caltradesize();
        System.out.println("Please enter Lot Size");
        swaps2.callotsize();
        System.out.println("Please enter Swap Rate Long");
        swaps2.callongrate();
        System.out.println("Please enter Swap Rate Short");
        swaps2.calshortrate();
        Calculator.calcrate();

	}
}
