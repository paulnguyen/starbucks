

package starbucks ;

public interface IScreen
{

    void touch(int x, int y) ;              // send touch events to screen
    String display() ;                      // displays screen components
    String name() ;                         // returns name of screen
    void next() ;                           // navigate to next screen
    void prev() ;                           // navigate to previous screen
    void setNext(IScreen s, String n ) ;    // set next screen with action name
    void setPrev(IScreen s, String n ) ;    // set previous screen with action name

}
