import java.util.ArrayList;

public class RightTriangle extends Polygon {
	public RightTriangle(ArrayList<Double> sides) throws Exception{
		super(sides);
		if(sides.size() != 3)
			throw new Exception("A triangle requires exactly 3 sides.");
	}
	
	@Override
	public double computeArea() {
		double area = 0.5 * (sides.get(0) * sides.get(1)); 
		return area;
	}

}
