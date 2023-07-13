package br.ufla.gac111.grupo3;

/**
 * Representa um mapa com todos os itens que participam da simulacao.
 * <p>
 * A criação do mapa é realizada instanciando uma matriz de Itens cujas
 * dimensões são informadas por paramentro
 * 
 * @author David J. Barnes and Michael Kolling and Luiz Merschmann
 * @author Whilker Henrique Dos Santos Silva
 */

public class Mapa {

    // Atributos
    private Item[][] itens;
    private int largura;
    private int altura;

    /**
     * Construtor de obejetos do tipo mapa
     * 
     * @param largura
     * @param altura
     */
    
    public Mapa(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        itens = new Item[altura][largura];
    }

    /**
     * Adiicona um item ao mapa na localização atual do item
     * 
     * @param i
     */

    public void adicionarItem(Item i) {
        itens[i.getLocalizacaoAtual().getX()][i.getLocalizacaoAtual().getY()] = i;
    }

    /**
     * Remove um item do mapa na localização atual do item
     * 
     * @param i
     */

    public void removerItem(Item i) {
        itens[i.getLocalizacaoAtual().getX()][i.getLocalizacaoAtual().getY()] = null;
    }

    /**
     * Remove um item no mapa e o adiciona novamente em sua nova localização
     * 
     * @param i
     */
    public void atualizarMapa(Item i) {
        removerItem(i);
        adicionarItem(i);
    }

    /**
     * 
     * @param x
     * @param y
     * @return
     */

    public Item getItem(int x, int y) {
        return itens[x][y];
    }

    /**
     * 
     * @return
     */

    public int getLargura() {
        return largura;
    }

    /**
     * 
     * @return
     */

    public int getAltura() {
        return altura;
    }

}
