package starbucks;

public interface IFrame
{
    
    void setCurrentScreen( IScreen s ) ;
    void setMenuItem( String slot, IMenuCommand c ) ;
    void touch(int x, int y) ;
    void previousScreen() ;
    void nextScreen() ;
    String screen() ;
    void display() ;
    void landscape() ;
    void portrait() ;
    void cmd( String c ) ;
    void selectA() ;
    void selectB() ;
    void selectC() ;
    void selectD() ;
    void selectE() ;
    
}


