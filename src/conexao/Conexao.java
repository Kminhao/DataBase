
package conexao;

import static conexao.IConexao.CLASSNAME_MYSQL;
import static conexao.IConexao.MYSQL;
import static conexao.IConexao.PORT_MYSQL;


public class Conexao extends ConexaoAbstract {
    public Conexao(){
        
        
    }
    
    public void configurar(){
        this.port = PORT_MYSQL;
        this.className = CLASSNAME_MYSQL;
        this.setConexao(MYSQL, "boteco", "localhost"); //ip da maquina
        this.setLogin("root", "aluno123");
    }
    
}
