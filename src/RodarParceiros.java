
import parceiros.impl.PessoaImpl;
import parceiros.interfaces.EmpresaInt;

public class RodarParceiros {

	public static void main(String[] args) {
		EmpresaInt empInt = new PessoaImpl();
		empInt.cadastro();
	}
}

