
package boteco;


public class Cliente {
    
    
    private int id;
    private String nome;
    private String cpf;
    private ClienteDAO dao;
    
    
    public Cliente(){
         dao = new ClienteDAO();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void inserir(){
        if(dao.inserir(nome,cpf))
            System.out.println("Inserido com sucesso");
            else{
                    System.out.println("Erro na inserção");
                    }
        }    


    



    


    public static void main (String ... args){
       Cliente cliente = new Cliente();
        cliente.setNome("Klébin");
        cliente.setCpf("2469");
        ClienteDAO dao = new ClienteDAO();
        
        boolean b = dao.inserir(cliente.getNome(),
                                cliente.getCpf());
        if (b){
                System.out.println("Inserido com sucesso!!!");
        }                       
        
        
       
    }
    
}