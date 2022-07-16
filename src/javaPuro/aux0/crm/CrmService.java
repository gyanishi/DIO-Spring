package aux0.crm;

public class CrmService {
	public CrmService() {
		super();
	}
	public static void gravar(String nome, String cep, String estado, String cidade) {
		System.out.println("Cliente salvo no sistema");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(estado);
		System.out.println(cidade);
	}
}
