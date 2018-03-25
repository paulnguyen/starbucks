

package starbucks ;

public class FourPinDigits implements IPinState
{
    IPinStateMachine machine ;

    public FourPinDigits( IPinStateMachine m )
    {
        this.machine = m ;
    }

    public void backspace() {
        machine.setStateThreePinDigits(null) ;
    }

    public void number( String digit ) {

    }

    public void validPin() {

    }

    public void invalidPin() {
        machine.setStateNoPinDigits() ;
    }

}
