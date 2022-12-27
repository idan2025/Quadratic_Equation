import static java.lang.System.out;
import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  
	double a=0,b=0,c=0;
	out.println("Welcome to the Quandratic Equation solver");
	out.println("Do the values contain a fraction?");
	String Answer=sc.nextLine();
	Boolean t=(Answer.equals("yes"));
	
	
	if(!t) {
		out.println("Fraction mode: Off");
		out.println("Input Your numbers in the next order");
		out.println("Value of X in power (a), Value of X (b), Value of the number (c)");
		a=sc.nextDouble();b=sc.nextDouble();c=sc.nextDouble();
	}
		
	if (t) {         
        // Start of Fraction of value in X to power of 2
		out.println("Fraction mode: On");
		out.println("In order to input a full number in fraction mode,Do the following:");
		out.println("Example:");
		out.println("2   0   3  ");
		out.println("-   -   -  ");
		out.println("1   1   4  ");
		out.println("(Input only numbers)");
		out.println("-------------------------");
		out.println("Input the first fraction:");
        int a1 = sc.nextInt();
        out.println("-");
        int a2 = sc.nextInt();                           
        System.out.println("a = " + a1 + " / " + a2);
        
        //Start of Fraction of value of X
        out.println("Input the Second fraction:");
        int b1 = sc.nextInt(); 
        out.println("-");
        int b2 = sc.nextInt();                           
        System.out.println("b = " + b1 + " / " + b2);
        
        //Start of Fraction of number
        out.println("Input the third fraction:");
        int c1 = sc.nextInt();
        out.println("-");
        int c2 = sc.nextInt();                           
        System.out.println("c = " + c1 + " / " + c2);
        
        
        a=(double)a1/(double)a2;b=(double)b1/(double)b2;c=(double)c1/(double)c2;
	}
	
	

		double MinusB= b*(-1); //Constant Upper Half Start
		out.println("Value of X to Power is: "+a);
		out.println("Value of X is: "+b);
		out.println("Value of the number is: "+c);
		sc.close();
		double SquareRoot=UpperHalfSquareRoot(a,b,c);
		double BottomHalfResult=BottomHalf(a);
		double FinalResultPlus=FinalResultPlus(MinusB,SquareRoot,BottomHalfResult);
		double FinalResultMinus=FinalResultMinus(MinusB,SquareRoot,BottomHalfResult);
		
		out.println("X1= "+FinalResultPlus);
		
		
		if(FinalResultPlus!=(int)FinalResultPlus) {
			out.println();
			out.println("X1 Fraction= ");
			out.println(MinusB+SquareRoot);
			out.println("---");
			out.println(BottomHalfResult);
			out.println();
		}
		out.println("X2= "+FinalResultMinus);
		out.println();
		
		if(FinalResultMinus!=(int)FinalResultMinus) {
			out.println("X2 Fraction= ");
			out.println(MinusB-SquareRoot);
			out.println("---");
			out.println(BottomHalfResult);
		}
		out.println("Made By Idan Less");
	}
	
		public static double UpperHalfSquareRoot(double a, double b, double c) {
			double SquareRoot=Math.sqrt((Math.pow(b,2))-(4*a*c));
			//out.println("s "+SquareRoot);
			return SquareRoot;
			}
		
		public static double BottomHalf(double a) {
			double BottomHalfResult=(2*a);
			//out.println("BH "+BottomHalfResult);
			return BottomHalfResult;
		}
		
		public static double FinalResultPlus(double MinusB,double SquareRoot, double BottomHalfResult) {
			double Result = ((MinusB)+SquareRoot)/(BottomHalfResult);
			//out.println("PR "+Result);
			return Result;
			
		}
		public static double FinalResultMinus(double MinusB,double SquareRoot, double BottomHalfResult) {
			double Result = ((MinusB)-SquareRoot)/(BottomHalfResult);
			//out.println("MR "+Result);
			return Result;
		}
	}
