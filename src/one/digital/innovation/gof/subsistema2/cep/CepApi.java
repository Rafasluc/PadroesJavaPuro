package one.digital.innovation.gof.subsistema2.cep;

import one.digital.innovation.gof.Singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Olinda";
    }
    public String recuperarEstado(String cep){
        return "PE";
    }

}
