package lesson5.figures;

public abstract class Figure {
	abstract void getFigure();	
}

class UpwardHat extends Figure{
	
	void getFigure()
	{
		System.out.print("/\\");
	}
}

class DownwardHat extends Figure{
	
	void getFigure()
	{
		System.out.print("\\/" );
	}
}

class FaceMaker extends Figure{
	
	void getFigure()
	{
		System.out.print(":)");
	}
}

class Vertical extends Figure{
	
	void getFigure()
	{
		System.out.print("||" );
	}
}

