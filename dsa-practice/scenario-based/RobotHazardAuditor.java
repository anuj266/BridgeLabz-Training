package scenrio;

import java.util.Scanner;
class RobotSafetyException extends Exception{
	public RobotSafetyException(String message) {
		super(message);
	}
}

public class RobotHazardAuditor {
	public static void main(String[] args) throws RobotSafetyException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arm Precision (0.0 - 1.0): ");
		double armPrecision = sc.nextDouble();
		System.out.println("Enter Worker Density (1 - 20): ");
		int workerDensity = sc.nextInt();
		System.out.println("Enter Machinery State (Worn/Faulty/Critical): ");
		String machineryState = sc.next();
		RobotHazardAuditor rha = new RobotHazardAuditor();
        double output = rha.CalculateHazardRisk(armPrecision, workerDensity, machineryState);
        System.out.println("Robot Hazard Risk Score: "+output);
        sc.close();
		
	}
	public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException{
		if(armPrecision <= 0 || armPrecision > 1.0) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		if(workerDensity <1 || workerDensity >20){
	        throw new RobotSafetyException("Error Worker density mut be 1-20");
	    }
	    if((!machineryState.equals("Worn")) && (!machineryState.equals("Faulty")) && (!machineryState.equals("Critical"))){
	        throw new RobotSafetyException("Error: Unsupported machinery state");
	    }
	    double machineRiskFactor = 0;
	    if(machineryState.equals("Worn")){
	        machineRiskFactor = 1.3;
	    }
	    if(machineryState.equals("Faulty")){
	        machineRiskFactor = 2.0;
	    }
	    if(machineryState.equals("Critical")){
	        machineRiskFactor = 3.0;
	    }
	    double hazardRisk = ((1.0-armPrecision)*15.0)+(workerDensity*machineRiskFactor);
	    return hazardRisk;
	}
}
