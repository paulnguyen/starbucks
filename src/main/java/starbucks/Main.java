
package starbucks ;

public class Main
{

    public static void main(String [] args)
    {
        IApp app = new AppAuthProxy() ;

		app.display() ;
		app.touch(1,5) ;
		app.touch(2,5) ;
		app.touch(3,5) ;
		app.touch(1,6) ;
		app.display() ;

    }

}
