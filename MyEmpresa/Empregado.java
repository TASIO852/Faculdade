final class Empregado extends Pessoa{
    private int numeroSeccao; 
    private float salarioBase;
    private float iRS;

    
    /** 
     * @param numeroSeccao
     */
    public void setNumeroSeccao(int numeroSeccao) {
        this.numeroSeccao = numeroSeccao;
    }

    
    /** 
     * @param salarioBase
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    /** 
     * @param iRS
     */
    public void setiRS(float iRS) {
        this.iRS = iRS;
    }

    
    /** 
     * @return int
     */
    public int getNumeroSeccao() {
        return numeroSeccao;
    }

    
    /** 
     * @return float
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    
    /** 
     * @return float
     */
    public float getiRS() {
        return iRS;
    }

    
    /** 
     * @return float
     */
    public float calcularSalario(){
        float salario = getSalarioBase() + getiRS();
        return salario;
    } 
}
