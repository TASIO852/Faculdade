public class Produto {
    private String designacao;
    private Float PrecoVendaPublico;
    private int stock;

    
    /** 
     * @param designacao
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    
    /** 
     * @param precoVendaPublico
     */
    public void setPrecoVendaPublico(Float precoVendaPublico) {
        this.PrecoVendaPublico = precoVendaPublico;
    }

    
    /** 
     * @param Stock
     */
    public void setStock(int Stock) {
        this.stock = Stock;
    }

    
    /** 
     * @return String
     */
    public String getDesignacao() {
        return designacao;
    }

    
    /** 
     * @return Float
     */
    public Float getPrecoVendaPublico() {
        return PrecoVendaPublico;
    }

    
    /** 
     * @return int
     */
    public int getStock() {
        return stock;
    }

    public void mostrar() {
        System.out.println("Hoje nos temos no stock: " + getStock() + " litros do tipo " + getDesignacao()
                + ".E esta no valor de " + getPrecoVendaPublico() +".\n");
    }
}
