package one.digitalinnovation.gof.subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonLazy;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String estado) {
        return "SP";
    }
}
