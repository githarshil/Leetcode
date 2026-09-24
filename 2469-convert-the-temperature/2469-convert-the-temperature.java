class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Farenheit = celsius * 1.80 + 32.00;
        return new double[]{Kelvin,Farenheit};
    }
}