package dailycoding.oop;

class Accounting {
	public double valueOfsupply;
	public static double vatRate = 0.1;

	public Accounting(double _valueOfSupply) {
		this.valueOfsupply = _valueOfSupply;
	}

	public double getVAT() {
		return valueOfsupply * vatRate;
	}

	public double getTotal() {
		return valueOfsupply + getVAT();
	}
}