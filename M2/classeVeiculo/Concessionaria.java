import java.util.ArrayList;

public class Concessionaria implements DAO {

  ArrayList<Veiculo> listVeiculos;
 

  public Concessionaria() {
	  listVeiculos = new ArrayList <Veiculo>();
  }

  public void salvar(Object veic) {
      listVeiculos.add((Veiculo)veic);  
  }
  
  public void atualizar(Object veic, String registro) {
	  int index = 0;
	  
	  for (Veiculo veiculo : listVeiculos) {
		  if (veiculo.getRegistro().contains(registro)) {
			  index = listVeiculos.indexOf(veiculo);
			  listVeiculos.set(index, (Veiculo) veic);
		  }
	  }
  }
  
 
  public void deletar(String registro) {
	  int index = 0;
	  	  
	  for (Veiculo veiculo : listVeiculos) {
		  if (veiculo.getRegistro().contains(registro)) {
			  index = listVeiculos.indexOf(veiculo);
			  listVeiculos.remove(index);
			  break;
		  }
	  }
  }
  
  
  public Object getByRegistro(String registro) {
	  Veiculo veiculoEncontrado = null;
	  
	  for (Veiculo veiculo : listVeiculos) {
		  if (veiculo.getRegistro() == registro) {
			  veiculoEncontrado = veiculo;
		  }
		  
	  }
	return veiculoEncontrado;
  }
  
  public void print() {
    for (Veiculo veic : listVeiculos) {
      System.out.println(veic.getDetalhes(veic));
    }
  }
}
