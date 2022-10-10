final class Fornecedor extends Pessoa {
    private float plaFond; 
    private float ValorEmDivida; 

    
    /** 
     * @param plaFond
     */
    public void setPlaFond(float plaFond) {
        this.plaFond = plaFond;
    }

    
    /** 
     * @param valorEmDivida
     */
    public void setValorEmDivida(float valorEmDivida) {
        this.ValorEmDivida = valorEmDivida;
    }

    
    /** 
     * @return float
     */
    public float getPlaFond() {
        return plaFond;
    }

    
    /** 
     * @return float
     */
    public float getValorEmDivida() {
        return ValorEmDivida;
    }
}
