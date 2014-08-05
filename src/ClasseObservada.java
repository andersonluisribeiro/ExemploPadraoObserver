import java.util.Observable;


public class ClasseObservada extends Observable{

	public void mudandoOEstado(){
		setChanged();
		notifyObservers();		
	}
	

}
