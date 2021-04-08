import java.util.Scanner;
abstract class Instrument
{
abstract void play();
}
 class Piano extends Instrument
 {
	 void  play()
	 {
		 System.out.println(" Piano is playing  tan tan tan tan");
	 }
 }
 class Flute extends Instrument
 {
	 void  play()
	 {
		 System.out.println("Flute is playing  toot toot toot toot ");
	 }
 }
 class Guitar extends Instrument
 {
	 void  play()
	 {
		 System.out.println("Guitar is playing  tin  tin  tin  ");
	 }
 }

 

public class Abs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrument arr[]=new Instrument[10];
		Instrument p=new Piano();
		p.play();
		Instrument f=new Flute();
		f.play();
		Instrument g=new Guitar();
		g.play();
		
						
						
						
						
	}

}


