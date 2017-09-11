package lesson5.figures;


public class MainFigure {

	public static void main(String[] args)
	{
		Figure[] figs = new Figure[5];
		figs[0] = new UpwardHat();
		figs[1] = new UpwardHat();
		figs[2] = new DownwardHat();
		figs[3] = new FaceMaker();
		figs[4] = new Vertical();
		
		for(Figure f: figs)
		{
			f.getFigure();
		}
		System.out.println();
		for(Figure f: figs)
		{
			System.out.print(f.getClass().getSimpleName() + ": ");
			f.getFigure();
			System.out.println();
		}
	}
}

/*
 * Output: 
 * 
/\/\\/:)||
UpwardHat: /\
UpwardHat: /\
DownwardHat: \/
FaceMaker: :)
Vertical: ||
 * 
 */
