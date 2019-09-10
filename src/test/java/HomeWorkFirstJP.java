import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HomeWorkFirstJP {

    private Integer calcPercent(Integer percent, Integer base) {return base*percent/100;}

    @Test
    public void showPercent() {
        Integer percentResult;
        percentResult = calcPercent(246, 15);
        System.out.println(" The result is " + percentResult + "%");
        Assertions.assertEquals(36, percentResult, "1st Fale!" );
    }

    private Double calcFuel(Double tank, Double way) {return 100*tank/way;}

    @Test
    public void showFuel() {
        Double fuelResult;
        fuelResult = calcFuel(70.00, 1400.00);
        System.out.println("Fuel consumption is " +fuelResult + " l" + " / 100 km");
        Assertions.assertEquals(5, fuelResult, "2nd Fale!" );
    }

    @Test
    public void showNumMatches() {
        Integer numMatches;
        numMatches = StringUtils.countMatches("The human being is very strong, but rather vulnerable","b");
        System.out.println("Number of 'b' is:" + numMatches);
        Assertions.assertEquals(3, numMatches, "3d Fale!" );
    }


}
