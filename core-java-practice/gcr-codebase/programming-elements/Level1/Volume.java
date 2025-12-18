package Level1;
public class Volume {
    public static void main(String[] args) {
        int radius1 = 6378;
        float radius2 = radius1*1.6f;
        Double volume1 = (4.0/3.0)*3.14*radius1*radius1*radius1;
        Double volume2 = (4.0/3.0)*3.14*radius2*radius2*radius2;
        System.out.println("The volume of earth in cubic kilometers is "+volume1+" and cubic miles is "+volume2);
    }
}
