package scenrio;
import java.util.*;

abstract class GoodsTransport {
    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    public GoodsTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getTransportDate() {
        return transportDate;
    }

    public void setTransportDate(String transportDate) {
        this.transportDate = transportDate;
    }

    public int getTransportRating() {
        return transportRating;
    }

    public void setTransportRating(int transportRating) {
        this.transportRating = transportRating;
    }

    abstract public String vehicleSelection();

    abstract public float calculateTotalCharge();
}

class BrickTransport extends GoodsTransport {
    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public float getBrickSize() {
        return brickSize;
    }

    public void setBrickSize(float brickSize) {
        this.brickSize = brickSize;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public void setBrickQuantity(int brickQuantity) {
        this.brickQuantity = brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    public void setBrickPrice(float brickPrice) {
        this.brickPrice = brickPrice;
    }

    public String vehicleSelection() {
        if (brickQuantity < 300) return "Truck";
        else if (brickQuantity >= 300 && brickQuantity <= 500) return "Lorry";
        else return "MonsterLorry";
    }

    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = price * 0.3f;

        float discountPercentage = 0;
        if (transportRating == 5) discountPercentage = 20;
        else if (transportRating == 3 || transportRating == 4) discountPercentage = 10;

        float discount = price * discountPercentage / 100;

        String vehicle = vehicleSelection();
        float vehiclePrice = 0;
        if (vehicle.equalsIgnoreCase("Truck")) vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("Lorry")) vehiclePrice = 1700;
        else if (vehicle.equalsIgnoreCase("MonsterLorry")) vehiclePrice = 3000;

        return (price + vehiclePrice + tax) - discount;
    }
}

class TimberTransport extends GoodsTransport {
    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius, String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberLength() {
        return timberLength;
    }

    public void setTimberLength(float timberLength) {
        this.timberLength = timberLength;
    }

    public float getTimberRadius() {
        return timberRadius;
    }

    public void setTimberRadius(float timberRadius) {
        this.timberRadius = timberRadius;
    }

    public String getTimberType() {
        return timberType;
    }

    public void setTimberType(String timberType) {
        this.timberType = timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    public void setTimberPrice(float timberPrice) {
        this.timberPrice = timberPrice;
    }

    public String vehicleSelection() {
        float area = 2 * 3.147f * timberRadius * timberLength;

        if (area < 250) return "Truck";
        else if (area >= 250 && area <= 400) return "Lorry";
        else return "MonsterLorry";
    }

    public float calculateTotalCharge() {
        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        float timberRate = 0;
        if (timberType.equalsIgnoreCase("Premium")) timberRate = 0.25f;
        else if (timberType.equalsIgnoreCase("NonPremium")) timberRate = 0.15f;

        float price = volume * timberPrice * timberRate;
        float tax = price * 0.3f;

        float discountPercentage = 0;
        if (transportRating == 5) discountPercentage = 20;
        else if (transportRating == 3 || transportRating == 4) discountPercentage = 10;

        float discount = price * discountPercentage / 100;

        String vehicle = vehicleSelection();
        float vehiclePrice = 0;
        if (vehicle.equalsIgnoreCase("Truck")) vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("Lorry")) vehiclePrice = 1700;
        else if (vehicle.equalsIgnoreCase("MonsterLorry")) vehiclePrice = 3000;

        return (price + vehiclePrice + tax) - discount;
    }
}

class Utility {
    public GoodsTransport parseDetails(String input) {
        String[] parts = input.split(":");

        String transportId = parts[0];
        String transportDate = parts[1];
        int transportRating = Integer.parseInt(parts[2]);
        String transportType = parts[3];

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            float brickSize = Float.parseFloat(parts[4]);
            int brickQuantity = Integer.parseInt(parts[5]);
            float brickPrice = Float.parseFloat(parts[6]);

            return new BrickTransport(transportId, transportDate, transportRating, brickSize, brickQuantity, brickPrice);
        } else if (transportType.equalsIgnoreCase("TimberTransport")) {
            float timberLength = Float.parseFloat(parts[4]);
            float timberRadius = Float.parseFloat(parts[5]);
            String timberType = parts[6];
            float timberPrice = Float.parseFloat(parts[7]);

            return new TimberTransport(transportId, transportDate, transportRating, timberLength, timberRadius, timberType, timberPrice);
        }
        return null;
    }

    public boolean validateTransportId(String transportId) {
        if (transportId.matches("^RTS\\d{3}[A-Z]$")) {
            return true;
        } else {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return false;
        }
    }

    public String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport) return "TimberTransport";
        else if (goodsTransport instanceof BrickTransport) return "BrickTransport";
        return "Unknown";
    }
}

public class FutureLogistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        String transportId = input.split(":")[0];

        if (!utility.validateTransportId(transportId)) {
            return;
        }

        GoodsTransport goodsTransport = utility.parseDetails(input);
        String objectType = utility.findObjectType(goodsTransport);

        if (objectType.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) goodsTransport;

            System.out.println("\nTransporter id : " + bt.getTransportId());
            System.out.println("Date of transport : " + bt.getTransportDate());
            System.out.println("Rating of the transport : " + bt.getTransportRating());
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
            System.out.println("Vehicle for transport : " + bt.vehicleSelection());
            System.out.println("Total charge : " + bt.calculateTotalCharge());

        } else if (objectType.equals("TimberTransport")) {
            TimberTransport tt = (TimberTransport) goodsTransport;

            System.out.println("\nTransporter id : " + tt.getTransportId());
            System.out.println("Date of transport : " + tt.getTransportDate());
            System.out.println("Rating of the transport : " + tt.getTransportRating());
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
            System.out.println("Vehicle for transport : " + tt.vehicleSelection());
            System.out.println("Total charge : " + tt.calculateTotalCharge());
        }

        sc.close();
    }
}
