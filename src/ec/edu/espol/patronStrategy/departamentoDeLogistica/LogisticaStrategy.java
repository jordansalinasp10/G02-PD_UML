package ec.edu.espol.patronStrategy.departamentoDeLogistica;

public interface LogisticaStrategy {
	void transportar(Articulo[] articulos);
	//Cada clase que la implemente brindara su propia logica
}

