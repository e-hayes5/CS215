
public class Cyclist implements IsMobile{
	public Cyclist() {
		
	}
	@Override
	public double travelFlat(double distkm) {
		return distkm/15;
	}
	@Override
	public double travelElevated(double distkm, double angDegrees) {
		double baseTime = distkm/15;
		return baseTime * (1 + Math.pow(angDegrees, 1.4)/15);
	}

}
