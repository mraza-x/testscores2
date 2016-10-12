/**
Mohammed Raza
CSC 162 - Lab6 # 2 (exception class)
*/

public class InvalidTestScore extends Exception
{



	public InvalidTestScore()
	{

		super("Message: Invalid Test Score");
	}

	public InvalidTestScore(String strMessage)
	{
		super(strMessage);
	}


}
