

package starbucks ;


public interface IMenuCommand
{
    void execute() ;
    void setReceiver( IMenuReceiver target ) ;
}
