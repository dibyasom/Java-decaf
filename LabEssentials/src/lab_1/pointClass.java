package lab_1;

class point{
	private double X, Y;
	static String target;
	
	point(double x, double y){
		this.X = x;
		this.Y = y;
	}
	
	Double[] getPoint() {
		Double[] pt = {this.X, this.Y};
		return pt;
	}
	
	void setPoint() {
		return;
	}
}

public class pointClass {
	public static void main(String[] args) {
		
		System.out.println("\nSetting assualt co-ordinates.");
		point pt1 = new point(105.34649, 54.98423);
		
		System.out.println("Ready for assault @ \n Printing out instance variables.");
		Double[] coordinates = pt1.getPoint();
		System.out.println("Latitude -> "+coordinates[0]+"\nLongitude -> "+coordinates[1]+"\n");
		
		System.out.println("\nConfidential, Printing out static variable/ class field.");
		point.target = "China!!";
		System.out.println(point.target);
	}
}
