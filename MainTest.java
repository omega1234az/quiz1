import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testCalculateWaterBill() {
        main.currentWater = 30;
        main.lastWater = 20;
        int expectedWaterBill = (30 - 20) * 5; 
        assertEquals(expectedWaterBill, main.calculateWaterBill());
    }

    @Test
    public void testCalculateWaterBillNegativeCase() {
        main.currentWater = 20;
        main.lastWater = 30;
        int expectedWaterBill = 0; 
        assertEquals(expectedWaterBill, main.calculateWaterBill());
    }

    @Test
    public void testCalculateElectricityBill() {
        main.currentElectricity = 50;
        main.lastElectricity = 30;
        int expectedElectricityBill = (50 - 30) * 6; 
        assertEquals(expectedElectricityBill, main.calculateElectricityBill());
    }

    @Test
    public void testCalculateElectricityBillNegativeCase() {
        main.currentElectricity = 30;
       main.lastElectricity = 50;
        int expectedElectricityBill = 0;
        assertEquals(expectedElectricityBill, main.calculateElectricityBill());
    }

    @Test
    public void testCalculateResultBillRoomTypeS() {
        main.currentElectricity = 50;
        main.lastElectricity = 30;
        main.currentWater = 30;
        main.lastWater = 10;

        int expectedBill = 1500 + (50 - 30) * 6 + (30 - 10) * 5; 
        assertEquals(expectedBill, main.calculateResultBill("S"));
    }

    @Test
    public void testCalculateResultBillRoomTypeD() {
        main.currentElectricity = 70;
        main.lastElectricity = 50;
        main.currentWater = 40;
        main.lastWater = 20;

        int expectedBill = 2000 + (70 - 50) * 6 + (40 - 20) * 5; 
        assertEquals(expectedBill, main.calculateResultBill("D"));
    }
}
