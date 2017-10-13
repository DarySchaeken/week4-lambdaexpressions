package be.pxl.lambdaexpressions.opdracht1;

public class NumberSelector {
	private NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		return numberMachine.processNumbers(new NumberFilter() {

			@Override
			public boolean check(int number) {
				if (number % 2 == 0) {
					return true;
				}
				return false;
			}
		});
		
	}
	
	public String showNumbersAbove(int bound){
		return numberMachine.processNumbers((int number) -> {return bound < number;}); 
	}
	
	public String printHexNumbers(){
		return numberMachine.convertNumbers((int number) -> {return Integer.toHexString(number);});
	}

}
