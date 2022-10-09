import java.util.List;
import java.util.ArrayList;
import java.util.List;

class Pessoa{
   private String nomep;
   private long Contribuinte; 
   private byte idade;

    
    /** 
     * @param Nomep
     */
    public void setNomep(String Nomep) {
        nomep = Nomep;
    }

    
    /** 
     * @param contribuinte
     */
    public void setContribuinte(long contribuinte) {
        Contribuinte = contribuinte;
    }

    
    /** 
     * @param Idade
     */
    public void setIdade(byte Idade) {
        this.idade = Idade;
    }

    
    /** 
     * @param cp
     */
    public void CodigoPostal(CodigoPostal cp){
        
    }

    
    /** 
     * @return String
     */
    public String getNomep() {
        return nomep;
    }

    
    /** 
     * @return long
     */
    public long getContribuinte() {
        return Contribuinte;
    }

    
    /** 
     * @return byte
     */
    public byte getIdade() {
        return idade;
    }
}
