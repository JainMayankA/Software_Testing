package Homework3;

public class Problem4Class {

	public enum Status {Member,NonMember};
	
	public boolean checkOut (Status status, double cart, int creditRating, int points) {
		   boolean approved=false;

		   if (status==Status.Member) {
			   if (cart > 1_500.0)
				   if (cart <= 2_250.00)
					   if (creditRating >= 750)
						   if (points > 1_000)
							   approved = true; }
		   else
			   if (cart <= 500.0)
				   approved = true;
			   else
				   if (creditRating > 700)
					   if (points > 500)
						   if (points <= 1_000)
							   approved = true;
		   return approved;
		}
}