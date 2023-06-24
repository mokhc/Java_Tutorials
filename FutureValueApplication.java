//@mokhc
// program demonstrates the determination of future value used in financial calculation

import java.io.PrintStream;

class FutureValue {
    //variables
    int period;
    double principle, rate;
    double nume, deno, mul;

    //constructor
    public FutureValue() {
    }

    //constructor
    //with parameters
    public FutureValue(int period, double principle, double rate) {
        //get value and calculate
        this.period = period;
        this.principle = principle;
        this.rate = rate;
        //used to determine the multiplier
        nume = (period / rate) * Math.pow((1 + rate), period);
        deno = period / rate;
        mul = nume / deno;
    }

    //method to determine FV
    public void GetFutureValue() {
        PrintStream ps = System.out;
        double value;
        value = mul * principle;
        ps.println("The FV for period " + period + " with principle " + principle + " and rate " + rate + " is " + value);
    }

    //method to determine FV
    //with parameters
    public void GetFutureValue(int period, double principle, double rate) {
        PrintStream ps = System.out;
        //get value and calculate
        this.period = period;
        this.principle = principle;
        this.rate = rate;
        //used to determine the multiplier
        nume = (period / rate) * Math.pow((1 + rate), period);
        deno = period / rate;
        mul = nume / deno;
        double value;
        value = mul * principle;
        ps.println("The FV for period " + period + " with principle " + principle + " and rate " + rate + " is " + value);
    }
}

public class FutureValueApplication {
    public static void main(String[] args) {
        FutureValue fv1 = new FutureValue(1, 1000, 0.05);
        fv1.GetFutureValue();
        FutureValue fv2 = new FutureValue();
        fv2.GetFutureValue(2, 1000, 0.05);
    }
}

