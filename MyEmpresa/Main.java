import java.util.Scanner;
import java.util.Random;
public class Main {
    // sistema de logistica para o empregado saber onde entregar onde pegar e quanto
    // cobrar e quanto vai ganhar (empregado freelancer)
    // sistema de entrega de cerveja
    // 3 interfaces 
    // delivery de cerveja artesanal
    public static CodigoPostal cp;
    public static Empresa e;
    public static Cliente cli;
    public static Produto prod;
    public static Fornecedor forn;
    public static Empregado emp;
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Random matriculaRandom = new Random();
        Random irs = new Random();
        Random sec = new Random();

        cli = new Cliente();
        emp = new Empregado();
        forn = new Fornecedor();
        prod = new Produto();
        e = new Empresa();
        cp = new CodigoPostal();


        System.out.println("=== Sistema fornecedor ===");
        System.out.println("Qual eo seu nome ou o nome da sua empresa ? \n");
        Scanner NomeForn = new Scanner(System.in);
            String nomef;
            nomef = NomeForn.nextLine();
            forn.setNomep(nomef);

        System.out.println("Quanto tempo vc tem de mercado ? \n");
        Scanner idadeForn = new Scanner(System.in);
            byte idadef;
            idadef = idadeForn.nextByte();
            forn.setIdade(idadef);

        System.out.println("Qual o valor do litro? \n");
        Scanner litrosForn = new Scanner(System.in);
            float litrosf;
            litrosf = litrosForn.nextFloat();
            forn.setValorEmDivida(litrosf);
            prod.setPrecoVendaPublico(litrosf);
            

        System.out.println("Qual eo nome da cerveja ? \n");
            Scanner nomeP  = new Scanner(System.in);
            String nomepr;
            nomepr = nomeP.nextLine();
            prod.setDesignacao(nomepr);
        
        System.out.println("Quantos litros você tem no stock ? \n");
            Scanner ps  = new Scanner(System.in);
            int Ps;
            Ps = ps.nextInt();
            prod.setStock(Ps);
            
        e.addProduto(prod);
        System.out.println("Qual o valor que deseja investir ? \n");
        Scanner valorForn = new Scanner(System.in);
            float dinf;
            dinf = valorForn.nextFloat();
            forn.setPlaFond(dinf);

        System.out.println("Coloque o seu cep com o nome da sua rua para que possamos buscar o seu produto para entrega. \n");
        Scanner zonaif = new Scanner(System.in);
        Scanner zonaef = new Scanner(System.in);
        Scanner zonaa = new Scanner(System.in);
            int zonaIF;
            int zonaEF;
            String zonaA;
            System.out.println("Primeira parte do cep antes do hifen (-) \n");
            zonaIF = zonaef.nextInt();
            System.out.println("Segunda parte do cep depois do hifen (-) \n");
            zonaEF = zonaif.nextInt();
            System.out.println("Coloque o nome da sua rua : \n");
            zonaA = zonaa.nextLine();
            cp.setExtencao(zonaEF);
            cp.setIndicativo(zonaIF);
            cp.setZona(zonaA);

        forn.setContribuinte(matriculaRandom.nextInt(99999) + 9999);
        System.out.println("Numero da sua matricula do cadastro no app : " + forn.getContribuinte() + ".\n");


        System.out.println("=== Sistema cliente === \n");
        System.out.println("Qual eo seu nome ? \n");
        e.addPessoa(cli);
        Scanner NomeCli = new Scanner(System.in);
            String nomeC;
            nomeC = NomeCli.nextLine();
            cli.setNomep(nomeC);
            

        while(true){
        System.out.println("Qual ea sua idade ? \n");
        Scanner idadeCli = new Scanner(System.in);
            byte idadeC;
            idadeC = idadeCli.nextByte();
            
            if(idadeC > 18){
                cli.setIdade(idadeC);
                break;
            }else{
                System.out.println("Voce nao tem idade minima para consumir bebida alcolica.\nColoque a idade correta !!! \n  ");
            }
        }

        prod.mostrar();
        System.out.println("Qual o produto deseja consumir ? \n");
            Scanner prodC = new Scanner(System.in);
            String prodc;
            prodc = prodC.nextLine();
            prod.setDesignacao(prodc);
           
        
        System.out.println("Qual a quantidade que voce deseja em litros ?\n ");
        Scanner litros = new Scanner(System.in);
            float litrosC;
            litrosC = litros.nextFloat();
            cli.setValorEmDivida(litrosC); 
    
        System.out.println("Quanto voce pretende gastar ? \n");
        Scanner valor = new Scanner(System.in);
            float dinC;
            dinC = valor.nextFloat();
            cli.setPlaFond(dinC);

        System.out.println("Coloque o seu cep com o nome da sua rua para que possamos entregar o seu produto. \n ");
        Scanner zonai = new Scanner(System.in);
        Scanner zonae = new Scanner(System.in);
        Scanner zonaca = new Scanner(System.in);
        
            int zonaI;
            int zonaE;
            String zonaAa;
            System.out.println("Primeira parte do cep antes do hifen (-) \n");
            zonaI = zonai.nextInt();
            System.out.println("Segunda parte do cep antes do hifen (-) \n");
            zonaE = zonae.nextInt();
            System.out.println("Coloque o nome da sua rua : \n");
            zonaAa = zonaca.nextLine();

            cp.setExtencao(zonaE);
            cp.setIndicativo(zonaI);
            cp.setZona(zonaAa);

        cli.setContribuinte(matriculaRandom.nextInt(99999) + 9999);
        System.out.println("seu valor em divida e : " + cli.obterSaldo());
        System.out.println("O numero do seu pedido e : " + cli.getContribuinte());
        



        System.out.println("=== Sistema Colaborador ===\n");
        e.setDataFundacao(15051995); 
        e.setNomeEmpresa("Ltb Logistica");
        System.out.println("Bem vindo a " + e.getNomeEmpresa() + " criada em " +  e.getDataFundacao()+".\n");
    

        System.out.println("Coloque seu nome para fazer a entrega ? \n");
        Scanner NomeEmp = new Scanner(System.in);
            String nomeE;
            nomeE = NomeEmp.nextLine();
            emp.setNomep(nomeE);

        while(true){
        System.out.println("coloque a sua idade ? \n");
        Scanner idadeEmp = new Scanner(System.in);
            byte idadeE;
            idadeE = idadeEmp.nextByte();
            
            if(idadeE > 18){
                emp.setIdade(idadeE);
                break;
            }else{
                System.out.println("Você nao tem idade minima para ser entregador.Coloque a idade correta. \n");
            }
        } 

        System.out.println("=== PRIMEIRA ENTREGA === ");
        emp.setSalarioBase(1000);
        emp.setiRS(irs.nextInt(99) + 9);
        System.out.println(emp.getNomep() + " ganhara fixo " + emp.getSalarioBase() + " e por entrega " + emp.getiRS() + " no total " + emp.calcularSalario()+".\n");

        emp.setNumeroSeccao(sec.nextInt(99));
        System.out.println("Seu numero de seccao e : " + emp.getNumeroSeccao() + " esse sera o numero no vc se identificara no sistema de entregas \n");
        emp.setContribuinte(matriculaRandom.nextInt(99999) + 9999);
        System.out.println(emp.getContribuinte() + " E esse sera o seu numero de identificaçao na empresa \n");
        System.out.println("Numero de matricula da sua entrega \n" + cli.getContribuinte());
        System.out.println("Voce ira entregar a mercadoria a : \n ");
        e.mostraPessoa(cli);
        System.out.println("No endereco : \n");
        cp.mostrar(cli);
        System.out.println("E entregara a mercadoria : \n");
        e.mostraProduto(prod);
        System.out.println("Voce ira cobrar o valor da sua entrega mais a quantidade de litros que a pessoa quer.");



        

    }
}
