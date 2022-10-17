package SoftDevLec6;

public class FullTimeEmployee extends Employee{
    private double hourlyRate;

    public FullTimeEmployee(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getHourlyRate() {
        System.out.println("This is a part of full time employee...");
        return hourlyRate;
    }
}
