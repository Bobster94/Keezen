package keezen;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by boybo on 11-6-2017.
 */
public interface SpelInterface extends Remote {
    public DeckController getDc() throws RemoteException;
    public void setDc(DeckController dc) throws RemoteException;
    public Speler[] getSpelerList() throws RemoteException;
    public void setSpelerList(Speler[] spelerList) throws RemoteException;
    public void addSpeler(Speler speler) throws RemoteException;
    public void bereidSpelVoor() throws RemoteException;


}
