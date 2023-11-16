package easy;

/**
 * https://leetcode.com/problems/convert-the-temperature/
 */
public class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[] {kelvin, fahrenheit};
    }
}
