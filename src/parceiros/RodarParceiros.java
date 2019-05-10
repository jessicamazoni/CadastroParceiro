package parceiros;

import parceiros.impl.EmpresaImpl;
import parceiros.interfaces.EmpresaInt;

public class RodarParceiros {

	public static void main(String[] args) {
		EmpresaInt empInt = new EmpresaImpl();
		empInt.cadastro();
	}
}

