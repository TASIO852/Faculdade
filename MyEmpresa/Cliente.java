final class Cliente extends Pessoa{
    private float plaFond;// limite de dinheiro que tem na mao 
    private float valorEmDivida; //valor da quantidade de produtos comprados (litro)

    
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
        this.valorEmDivida = valorEmDivida;
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
        return valorEmDivida;
    }

     
     /** 
      * @return float
      */
     public float obterSaldo(){
        float saldo = getPlaFond() * getValorEmDivida();
        return saldo;
    } 
    
}
