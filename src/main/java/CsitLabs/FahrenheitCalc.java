package CsitLabs;

import java.util.Scanner;

public class FahrenheitCalc {
    /***
     * Author: Shavar litchmore
     * Date: 04/10/19
     * CSIT 210: LAB 2 : PP 2.4
     * Temp Converter
     * <p>
     * Objective:
     * Create a version of the Temperature Converter application to convert
     * from fahrenheit to Celsius. Read the Fahrenheit temperature from the user.
     */

    private double fahrenheit = 0.0;
    private double celsius = 0.0;
    private double result = 0.0;



    private void convertToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to convert from fahrenheit to celsius: ");

        if (scanner.hasNextDouble()) {
            setFahrenheit(scanner.nextDouble());
            setCelsius(convertFormula(getFahrenheit()));
            System.out.print("Now converting from fahrenheit to celsius: " + getCelsius());

        } else {
            System.out.println("Terminating Application");
            System.exit(0);
        }


    }

    public double convertFormula(double fahrenheit) {
        double div = .5556;
        setResult(Math.round((fahrenheit - 32) * div));


        return getResult();
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getResult() {
        return result;
    }


    public void setResult(double result) {
        this.result = result;
    }
}


