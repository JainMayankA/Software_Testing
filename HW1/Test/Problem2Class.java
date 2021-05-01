package Homework3;

public class Problem2Class {

	public enum RRPvals {Off, Percent50, Percent40, Percent30, Percent25, Percent15, Percent10, Percent5};
	public enum RollProgram {Horizontal, Vertical45, Vertical};
	public enum Pods {Retracted, Deployed};
	public RRPvals rrp;
	public RollProgram rr;
	public Pods pods;

	public void controlGravitos (double AGL) {
		int index;
		RRPvals rrpTb [] = {	RRPvals.Off, RRPvals.Percent50, RRPvals.Percent40, RRPvals.Percent30, 
								RRPvals.Percent25, RRPvals.Percent15, RRPvals.Percent10, RRPvals.Off};
		RollProgram rrTb [] = {RollProgram.Horizontal, RollProgram.Horizontal, RollProgram.Horizontal, 
								RollProgram.Vertical45, RollProgram.Vertical45, RollProgram.Vertical45,  
								RollProgram.Vertical, RollProgram.Vertical};
		Pods podsTb [] = 	{	Pods.Retracted, Pods.Retracted, Pods.Retracted, Pods.Retracted, Pods.Retracted, 
								Pods.Retracted, Pods.Deployed, Pods.Deployed};
		if (AGL <= 0.3)
			index = 7;
		else
			if (AGL < 1_500.0)
				index = 6;
			else
				if (AGL <= 3_000.0)
					index = 5;
				else
					if (AGL < 5_000.0)
						index = 4;
					else
						if (AGL <= 8_000.0)
							index = 3;
						else
							if (AGL < 11_000.0)
								index = 2;
							else
								if (AGL <= 13_000.0)
									index = 1;
								else
									index = 0;
		rrp = rrpTb[index];
		rr = rrTb[index];
		pods = podsTb [index];
		}

	public RRPvals getRrp() {
		return rrp;
	}

	public void setRrp(RRPvals rrp) {
		this.rrp = rrp;
	}

	public RollProgram getRr() {
		return rr;
	}

	public void setRr(RollProgram rr) {
		this.rr = rr;
	}

	public Pods getPods() {
		return pods;
	}

	public void setPods(Pods pods) {
		this.pods = pods;
	}
	}