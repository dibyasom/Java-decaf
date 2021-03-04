package lab_1;

public class cliCalculator {
	/*
	 * Write operands and operators as Command Line Arguements.
	 * */
	public static void main(String[] args) {
		
		if(args.length>0)
			switch(args[1]){
			case "+":
				System.out.println("Sum -> "+(Integer.parseInt(args[0])+Integer.parseInt(args[2])));
				break;
			case "-":
				System.out.println("Difference -> "+(Integer.parseInt(args[0])-Integer.parseInt(args[2])));
				break;
			case "x":
				System.out.println("Product -> "+(Integer.parseInt(args[0])*Integer.parseInt(args[2])));
				break;
			case "/":
				System.out.println("Float division -> "+(Integer.parseInt(args[0])*1.0/Integer.parseInt(args[2])));
				break;
			default:
				System.out.println("This is no scientific calculator!!");
			}
		else
			System.out.println("Can't yet read the mind, sorry.");
		
	}
}
