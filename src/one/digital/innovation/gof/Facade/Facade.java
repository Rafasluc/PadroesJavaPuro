package one.digital.innovation.gof.Facade;

import one.digital.innovation.gof.subsistema1.crm.CrmService;
import one.digital.innovation.gof.subsistema2.cep.CepApi;

import javax.swing.*;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
