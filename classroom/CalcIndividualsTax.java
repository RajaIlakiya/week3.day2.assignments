package week3.day2.classroom;

public class CalcIndividualsTax implements TaxCalculation {
	public final String name = "ilakiya";

	/**
	 * String name="ilakiya" 
	 * double HRA-House Rent
	 *  Allowance double LTA
	 */
	public void calcDeductions(String name, double HRA, double LTA) {
		// TODO Auto-generated method stub
		System.out.println("Individual name is: " + name);
		double calCulate = HRA + LTA;
		System.out.println("calc deduction is: " + calCulate);
	}

	/**
	 * String name="ilakiya" 
	 * double netIncome double deductions
	 */

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		// TODO Auto-generated method stub
		System.out.println("Individual name is: " + name);
		double totalCalculation = netIncome + deductions;
		System.out.println("Total deduction is: " + totalCalculation);

	}

	/**
	 * Tax lab to file the tax of ilakiya
	 */
	public int taxSlab() {
		// TODO Auto-generated method stub
		System.out.println("Tax filed");
		return 0;
	}

	/**
	 * publish the tax of ilakiya
	 */
	public double CalcTaxandPublishValue() {
		// TODO Auto-generated method stub

		System.out.println("CalcTaxandPublishValue");
		return 0;
	}

	/**
	 * tax filed result
	 */
	public void taxOut() {
		System.out.println("Successfully Filed the Tax");
	}

}
