package br.ufla.gac111.grupo3;

public abstract class ItemDinamico extends Item {
    private Localizacao localizacaoDestino;

    public ItemDinamico(Localizacao localizacaoAtual, Localizacao localizacaoDestino) {
        super(localizacaoAtual);
        this.localizacaoDestino = localizacaoDestino;
    }

    public Localizacao getLocalizacaoDestino() {
        return localizacaoDestino;
    }

    public void setLocalizacaoDestino(Localizacao localizacaoDestino) {
        this.localizacaoDestino = localizacaoDestino;
    }

    public void executarAcao() {
        Localizacao destino = getLocalizacaoDestino();
        if (destino != null) {
            Localizacao proximaLocalizacao = getLocalizacaoAtual().proximaLocalizacao(localizacaoDestino);
            setLocalizacaoAtual(proximaLocalizacao);
        }
    }

    public boolean chegouDestino(){
        return getLocalizacaoAtual().equals(getLocalizacaoDestino());
    }
    
    public boolean estaPosicionado(Localizacao pontoParada){
        return getLocalizacaoAtual().equals(pontoParada);
    }

    public void trocaDestino(Localizacao localizacaoPonto1, Localizacao localizacaoPonto2){
        if(estaPosicionado(localizacaoPonto1))
            setLocalizacaoDestino(localizacaoPonto2);
        else if(estaPosicionado(localizacaoPonto2))
            setLocalizacaoDestino(localizacaoPonto1);
    }
}
