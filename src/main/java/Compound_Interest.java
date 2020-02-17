
public class Compound_Interest {

	public double compoundinterest(int p,int y,int r)
	{
		
		double compound_interest=(p*Math.pow(1+(double)r/100,y))-p;
		
		return compound_interest;
		
		
	}
}
