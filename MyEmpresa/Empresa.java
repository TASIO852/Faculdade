public class Empresa {
    private String NomeEmpresa;
    private int DataFundacao;
    private CodigoPostal Cp;


    
    /** 
     * @param nomeEmpresa
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.NomeEmpresa = nomeEmpresa;
    }

    
    /** 
     * @return String
     */
    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    
    /** 
     * @param dataFundacao
     */
    public void setDataFundacao(int dataFundacao) {
        DataFundacao = dataFundacao;
    }

    
    /** 
     * @return int
     */
    public int getDataFundacao() {
        return DataFundacao;
    }

    
    /** 
     * @param cp
     */
    public void setCp(CodigoPostal cp) {
        
    }

    
    /** 
     * @return CodigoPostal
     */
    public CodigoPostal getCp() {
        return Cp;
    }

    
    /** 
     * @param p
     */
    public void addPessoa(Pessoa p){
        System.out.println("Coloque seu nome aqui \n ");
    }

    
    /** 
     * @param prod
     */
    public void addProduto(Produto prod){
        System.out.println("Seu produto " + prod.getDesignacao() + " foi adicionado ao sistema no preco de " + prod.getPrecoVendaPublico() + " para o publico  e tem " + prod.getStock() + " no stock \n");
    }

    
    /** 
     * @param p
     */
    public void mostraPessoa(Pessoa p) {
        System.out.println(" A pessoa ou empresa de nome " + p.getNomep() + " e tem " + p.getIdade() +  " de idade no mercado de bebidas \n");
    }

    
    /** 
     * @param prod
     */
    public void mostraProduto(Produto prod) {
        System.out.println("O nome do produto e " + prod.getDesignacao() + " e tem " + prod.getStock()
        + " no stock. E esta no valor de " + prod.getPrecoVendaPublico() +"o litro \n");
    }
}
