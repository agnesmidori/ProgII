import java.util.List;



//
public interface DAO {
    public void salvar(Object obj); 
    
    /* Este mÃ©todo recebe como parÃ¢metro uma string com o registro do veiculo e o busca dentro da lista.
    *  Ao encontrar, o substitui por <obj> 
    */
    public void atualizar(Object obj, String registro); 
    
    /* 
    * Este mÃ©todo remove o elemento da lista.
    */
    public void deletar(String registro);
    
    /* 
    * Este mÃ©todo retorna um determinado elemento obtido atravÃ©s do registro na lista
    */
    public Object getByRegistro(String registro);

    
    public void print();
}
