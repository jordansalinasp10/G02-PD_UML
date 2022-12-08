package ec.edu.espol.patronStrategy.departamentoDeLogistica;
public class Logistica {
	//Logica del departamento de logistica
	
	public void enviarArticulos(Articulo[] articulos, LogisticaStrategy tipoDeEnvio) {		
		tipoDeEnvio.transportar(articulos);
	}
}
