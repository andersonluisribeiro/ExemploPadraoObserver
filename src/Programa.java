
public class Programa {

	
	public static void main(String[] args) {
		
		ClasseObservada objetoObservado = new ClasseObservada();
		ClasseObservadora primeiroObjetoObservador = new ClasseObservadora(objetoObservado, 1);
		ClasseObservadora segundoObjetoObservador = new ClasseObservadora(objetoObservado, 2);
		ClasseObservadora terceiroObjetoObservador = new ClasseObservadora(objetoObservado, 3);
		
		objetoObservado.mudandoOEstado();

	}

}
