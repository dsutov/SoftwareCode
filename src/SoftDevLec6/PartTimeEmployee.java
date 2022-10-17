package SoftDevLec6;

public class PartTimeEmployee extends Employee{

    private double hourlyRate;

    public PartTimeEmployee(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getHourlyRate() {
        System.out.println("This is a part of part time employee...");
        return hourlyRate;
    }
}
