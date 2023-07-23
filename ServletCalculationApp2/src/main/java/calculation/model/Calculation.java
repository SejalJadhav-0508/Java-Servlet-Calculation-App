package calculation.model;

public class Calculation {
	private int num1;
	private int num2;
	private String opr;
	private int res;
	private int sum;
	private int sub;
	private int mul;
	private int div;
	
	public Calculation() {}
	
	

	public Calculation(int num1, int num2, String opr, int res) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.setOpr(opr);
		this.setRes(res);
	}



	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public int getMul() {
		return mul;
	}

	public void setMul(int mul) {
		this.mul = mul;
	}

	public int getDiv() {
		return div;
	}

	public void setDiv(int div) {
		this.div = div;
	}



	public String getOpr() {
		return opr;
	}



	public void setOpr(String opr) {
		this.opr = opr;
	}



	public int getRes() {
		return res;
	}



	public void setRes(int res) {
		this.res = res;
	}



	@Override
	public String toString() {
		return "Calculation [num1=" + num1 + ", num2=" + num2 + ", opr=" + opr + ", res=" + res + "]";
	}
	
	
	
}
