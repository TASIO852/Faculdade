import java.util.ArrayList;
import java.util.List;

public class CodigoPostal {
    private int indicativo; 
    private int Extensao; 
    private String Zona; 


    
    /** 
     * @param zona
     */
    public void setZona(String zona) {
        this.Zona = zona;
    }

    
    /** 
     * @param indicativo
     */
    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    
    /** 
     * @param extensao
     */
    public void setExtencao(int extensao) {
        this.Extensao = extensao;
    }

    
    /** 
     * @return int
     */
    public int getExtencao() {
        return Extensao;
    }

    
    /** 
     * @return int
     */
    public int getIndicativo() {
        return indicativo;
    }

    
    /** 
     * @return String
     */
    public String getZona() {
        return Zona;
    }

    
    /** 
     * @param p
     */
    public void mostrar(Pessoa p){ 
     System.out.println("O numero do cep da rua e : " + getExtencao() + getIndicativo() +" .eo nome da Rua e : "+ getZona() + ".\n");
    }
}
