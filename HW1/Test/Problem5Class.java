package Homework3;

public class Problem5Class {

	public double calcY (double x) {
		double y;
		if (x<0.0)
			y=0.0;
		else
			if (x<2.0)
				y=x;
			else
				if (x<6.0)
					y=x*x-8*x+14;
				else
					if (x<8.0)
						y=-x+8;
					else
						y=0.0;
		return y;
	}
}