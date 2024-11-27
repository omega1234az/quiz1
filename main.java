


public class main {

    public static int waterM,ElectM;

    public static int currentWater;
    public static  int lastWater;
    public static int currentElectricity;
    public static int lastElectricity;

    public static int resultBill;

    public static int calculateWaterBill() {
        
        if (currentWater >= lastWater) {
            waterM = (currentWater-lastWater) *5;
        } 
        return waterM;
    }
    
    public static int calculateElectricityBill() {
        
        if (currentElectricity >= lastElectricity) {
            ElectM = (currentElectricity-lastElectricity) *6;
        } 
        return ElectM;
    }
    
    public static int calculateResultBill(String roomtype) {
        if (roomtype.equals("S")) {
             resultBill = 1500 + calculateElectricityBill() + calculateWaterBill();
        }
        else if (roomtype.equals("D")) {
            resultBill = 2000 + calculateElectricityBill() + calculateWaterBill();
        }
        return resultBill;
    }
    



    

    public static void main(String[] args) {
        currentElectricity = 20;
        lastElectricity = 10;

        currentWater = 30;
        lastWater = 10;

        String room = "D";

        System.out.println("your bill is : "+calculateResultBill(room));

        
    }
}
