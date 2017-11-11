

package starbucks ;

public interface IScreen
{

    void touch(int x, int y) ;	// send touch events to screen
    String display() ;			// displays screen components
    String name() ; 			// returns name of screen

}
