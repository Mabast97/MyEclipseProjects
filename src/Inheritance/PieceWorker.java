package Inheritance;

public class PieceWorker extends Employee{
	
	private int wage;  // employee's wage per piece
	private int piece;
	
	public PieceWorker(String first, String last, String ssn, Date birth, int wage, int piece)
	{
		super(first, last, ssn, birth);
		this.wage = wage;
		this.piece = piece;
	}

	public int getWage()
	{
		return wage;
	}
	
	public void setWage(int newWage)
	{
		wage = newWage;
	}

	public int getPiece()
	{
		return wage;
	}
	
	public void setPiece(int newPieces)
	{
		wage = newPieces;
	}
	
	@Override
	public double earnings() {
		return getPiece() * getWage();
	}
	
	public String toString()
	{
		String s = super.toString() + " Wage = " + wage + " piece " + piece;
		return s;
	}
	

}
