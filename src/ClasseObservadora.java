import java.util.Observable;
import java.util.Observer;


public class ClasseObservadora implements Observer{

	private Observable objetoObservado;
	private int codigo;
	
	public ClasseObservadora(Observable objetoObservado, int codigo) {
		this.codigo = codigo;
		this.objetoObservado = objetoObservado;
		this.objetoObservado.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Objeto " + codigo + " foi notificado.");		
	}

	

}
