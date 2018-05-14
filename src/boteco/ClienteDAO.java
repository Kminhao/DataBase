
package boteco;

import conexao.Conexao;


public class ClienteDAO {
    
    
    private Conexao conexao = new Conexao();
   
    
    public ClienteDAO(){
      conexao = new Conexao();
      conexao.configurar();
   }
    
    
    
    
   // private Conexao conexao = new Conexao();
    
    public boolean inserir(String nome, String cpf){
        //criar SQL com variaveis
        String sql = "Insert into cliente(nome, cpf)"
                + "values('" + nome +"','"+cpf+"')" ;
        
        //conectar com o BD
        conexao.conectar();
        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        //retornar erro ou ok
        return true;
    }
    
    
    
    public boolean atualizarNome(int id, String nome){
        //criar sql com variaveis
        String sql = "UPDATE cliente SET nome ='"+nome+"' WHERE id ="+id; 
        //conectar com o BD
        conexao.conectar();
        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        //retornar erro ou ok
        return true;
    }
    
        public boolean atualizarCPF(int id, String cpf){
        //criar sql com variaveis
        String sql = "UPDATE cliente SET cpf ='"+cpf+"' WHERE id ="+id; 
        //conectar com o BD
        conexao.conectar();
        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        //retornar erro ou ok
        return true;
    }
      
        
        
    public boolean deletar(int id){
        //criar sql com variaveis       //SE DER MERDA USA ISSO AQUI String.value(id);
        String sql ="DELETE FROM cliente WHERE id ="+id;
        //conectar com o BD
        conexao.conectar();
        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        //retornar erro ou ok
        return true;
       
    }
    
}
