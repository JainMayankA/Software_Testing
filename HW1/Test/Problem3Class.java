package Homework3;

public class Problem3Class {

	public enum landingState {None, DeployChute, ReleaseChute, Descend};
	
	public landingState landCraft (boolean landEngaged, double altitude, double speed) {
		landingState action=landingState.Descend;
		if (landEngaged) 
			if (altitude > 5_000.0) {
				if (speed < 500.0)
					if (speed >= 200.0)
						action = landingState.DeployChute; }
			else {
				if (altitude >= 2_500.0)
					if (speed < 200.0)
						if (speed > 100.0)
							action = landingState.ReleaseChute; }
		else
			action = landingState.None;
		return action;
	}
}