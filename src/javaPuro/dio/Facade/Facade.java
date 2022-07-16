package dio.Facade;

import aux0.crm.CrmService;
import aux1.crm.CepApi;

public class Facade {
	public void migrar(String nome, String cep) {
		String recuperarCidade = CepApi.getInstancia().recuperarCidade(cep);
		String recuperarEstado = CepApi.getInstancia().recuperarEstado(cep);
		CrmService.gravar(nome, cep, recuperarEstado, recuperarCidade);
	}
}
