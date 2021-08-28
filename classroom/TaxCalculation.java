package week3.day2.classroom;

public interface TaxCalculation {
	void calcDeductions(String name, double HRA, double LTA);
    void calcGrossIncome(String name, double netIncome, double deductions);
    public int taxSlab();
    public double CalcTaxandPublishValue();

}
