abstract class GeneralBank
{
	abstract void  getSavingsInterestRate();
	abstract void getFixedDepositInterestRate();
	
}

class ICICIBank extends GeneralBank
{
	 void getSavingsInterestRate()
	{
		System.out.println("savings is 4%");
	}
	 void getFixedDepositInterestRate()
	{
		System.out.println("fixed is 8.5%");
	}
}

class KotMBank extends GeneralBank
{
	 void getSavingsInterestRate()
	{
		System.out.println("savings is 6%");
	}
	 void getFixedDepositInterestRate()
	{
		System.out.println("fixed is 9%");
	}
}


public class Abs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank i=new ICICIBank();
		i.getFixedDepositInterestRate();
		i.getSavingsInterestRate();
		KotMBank k=new KotMBank();
		k.getFixedDepositInterestRate();
		k.getSavingsInterestRate();
		GeneralBank g=new KotMBank();
		g.getFixedDepositInterestRate();
		g.getSavingsInterestRate();
		GeneralBank c=new ICICIBank();
		c.getFixedDepositInterestRate();
		c.getSavingsInterestRate();
	}

}
