

package starbucks ;


import java.util.* ;

public class Screen implements IScreen, IDisplayComponent
{
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;
    private ITouchEventHandler chain ;

    public Screen()
    {
    }

    public void touch(int x, int y) {
        chain.touch(x, y) ;
    }
    
    public void next() {
        // add code here
    }
    
    public void prev()  {
        // add code here
    }
        
    public void setNext(IScreen s, String n )  {
        // add code here
    }
    
    public void setPrev(IScreen s, String n )  {
        // add code here
    }    

    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
        if (components.size() == 1 )
        {
            chain = (ITouchEventHandler) c ;
        }
        else
        {
            ITouchEventHandler prev = (ITouchEventHandler) components.get(components.size()-2) ;
            prev.setNext( (ITouchEventHandler) c ) ;
        }
    }
    
    public String display() { 
        String value = "" ;
        for (IDisplayComponent c : components )
        {
            value = value + c.display() + "\n" ;
        }
        return value ; 
    }

    public String name() {
        return (this.getClass().getName()).split("\\.")[1] ; 
    }

}
