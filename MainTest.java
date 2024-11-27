import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testCalculateWaterBill() {
        main.currentWater = 30;
        main.lastWater = 20;
        int expectedWaterBill = (30 - 20) * 5; // 50
        assertEquals(expectedWaterBill, main.calculateWaterBill());
    }

    @Test
    public void testCalculateWaterBillNegativeCase() {
        main.currentWater = 20;
        main.lastWater = 30;
        int expectedWaterBill = 0; // No negative billing
        assertEquals(expectedWaterBill, main.calculateWaterBill());
    }

    @Test
    public void testCalculateElectricityBill() {
        main.currentElectricity = 50;
        main.lastElectricity = 30;
        int expectedElectricityBill = (50 - 30) * 6; // 120
        assertEquals(expectedElectricityBill, main.calculateElectricityBill());
    }

    @Test
    public void testCalculateElectricityBillNegativeCase() {
        main.currentElectricity = 30;
       main.lastElectricity = 50;
        int expectedElectricityBill = 0; // No negative billing
        assertEquals(expectedElectricityBill, main.calculateElectricityBill());
    }

    @Test
    public void testCalculateResultBillRoomTypeS() {
        main.currentElectricity = 50;
        main.lastElectricity = 30;
        main.currentWater = 30;
        main.lastWater = 10;

        int expectedBill = 1500 + (50 - 30) * 6 + (30 - 10) * 5; // 1500 + 120 + 100 = 1720
        assertEquals(expectedBill, main.calculateResultBill("S"));
    }

    @Test
    public void testCalculateResultBillRoomTypeD() {
        main.currentElectricity = 70;
        main.lastElectricity = 50;
        main.currentWater = 40;
        main.lastWater = 20;

        int expectedBill = 2000 + (70 - 50) * 6 + (40 - 20) * 5; // 2000 + 120 + 100 = 2220
        assertEquals(expectedBill, main.calculateResultBill("D"));
    }
}
