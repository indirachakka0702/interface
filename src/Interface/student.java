package Interface;

public class student implements IDance,Isports
{
	public void Activity()
	{
		System.out.println("I have implemented my own activity");
		System.out.println("I can play both sports and dance");
		System.out.println("I can play sports only");
	}
	public void cricket()
	{
		System.out.println("I can play cricket");
		System.out.println(IDance.sBranchName);
		System.out.println(Isports.sBranchName);
	}
}
