package week3.day2.classroom;

public class InterfaceExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****CalcBusinessTax implementations result******");
		CalcBusinessTax calcTax1=new CalcBusinessTax();
		calcTax1.calcNetIncome("ilakiya", 1040000.80, 20000.90);
		calcTax1.display();
		
		System.out.println("*****CalcIndividualsTax implementations result******");
		CalcIndividualsTax calIndivi =new CalcIndividualsTax();
		calIndivi.calcDeductions("ilakiya", 190922.30, 1342.90);
		calIndivi.calcGrossIncome("ilakiya", 98086.20, 26789864.90);
		calIndivi.CalcTaxandPublishValue();
		calIndivi.taxOut();
		calIndivi.taxSlab();
		
		
	}

}
