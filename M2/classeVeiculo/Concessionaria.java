
// one class needs to have a main() method
import java.util.ArrayList;
import java.util.List;

public class Concessionaria implements DAO {

  ArrayList<Veiculo> listVeiculos; 

  public Concessionaria() {
    listVeiculos = new ArrayList();
  }

  public void salvar(Object veic) {
      listVeiculos.add((Veiculo)veic);  
  }

  public void print() {
    for (Veiculo veic : listVeiculos) {
      System.out.println(veic.getDetalhes(veic));
    }
  }


  //Implementar
  public void atualizar(Object obj) {
    
  }

  
  //Implementar
  public void deletar(int id) {
  }

  
  //Implementar
  public Object getById(int id) {
    return null;
  }

  
  //Implementar
  public List<Object> getAll() {
    return null;
  }
}
