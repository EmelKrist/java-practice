package _8kyu;

/**
 * https://www.codewars.com/kata/57a429e253ba3381850000fb
 */
public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi <= 18.5 ? "Underweight" : bmi <= 25.0 ? "Normal" : bmi <= 30.0 ? "Overweight" : "Obese";
    }

    public static String bmiAlter(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi <= 18.5) return "Underweight";
        else if (bmi <= 25.0) return "Normal";
        else if (bmi <= 30.0) return "Overweight";
        return "Obese";
    }
}
