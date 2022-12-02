//WAP to create a deposit machine with features withdraw,deposit view balance.

public class BankProcess {
	
	private int pass=123456789;
	private int ac_bal=10000;
	
    //Creating getter setter methods to access private variables in other class
	public int getPass() {
		return pass;
	}
	public void setPass(int ps) {
		this.pass = ps;
	}
	
    //cr method for deposit process
	public int getAc_balcr() {
		return ac_bal;
	}
	public void setAc_balcr(int bl) {
		this.ac_bal += bl;
	}

	//db method for withdraw process
	public int getAc_baldb() {
		return ac_bal;
	}
	public void setAc_baldb(int bl) {
		this.ac_bal -= bl;
	}
	
}
