package aux1.crm;

import dio.singleton.Singleton;

public class CepApi {
	private static CepApi inst = new CepApi();
	private CepApi() {
		super ();
	}
	public static CepApi getInstancia () {
		return inst;
	}
	public String recuperarCidade(String cep) {
		return "Sao Paulo";
	}
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
