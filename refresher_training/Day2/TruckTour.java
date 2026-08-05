import java.util.*;

public class TruckTour {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<List<Integer>> petrolpumps = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> pump = new ArrayList<>();

            pump.add(sc.nextInt()); // petrol
            pump.add(sc.nextInt()); // distance

            petrolpumps.add(pump);
        }

        int result = truckTour(petrolpumps);

        System.out.println(result);

        sc.close();
    }

    public static int truckTour(List<List<Integer>> petrolpumps) {

        int start = 0;
        int currentFuel = 0;
        int totalFuel = 0;

        for (int i = 0; i < petrolpumps.size(); i++) {

            int petrol = petrolpumps.get(i).get(0);
            int distance = petrolpumps.get(i).get(1);

            int netFuel = petrol - distance;

            currentFuel += netFuel;
            totalFuel += netFuel;

            if (currentFuel < 0) {
                start = i + 1;
                currentFuel = 0;
            }
        }

        return totalFuel > 0 ? start : -1;
    }
}