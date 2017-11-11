

package starbucks ;

public interface IApp
{
   
   void landscape() ;			// switch to landscape view
   void portrait() ; 			// switch to portrait view
   void touch(int x, int y) ;	// send touch event to current screen
   void display() ;  			// display contents of current screen
   void execute( String c ) ;	// trigger a nav bar menu itme
   String screen() ;			// get name of the current screen
   
}
