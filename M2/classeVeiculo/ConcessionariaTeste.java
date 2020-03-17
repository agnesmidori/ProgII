// one class needs to have a main() method
public class ConcessionariaTeste
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
      Carro chevette = new Carro(false);
      chevette.setFabricante("GM");
      chevette.setCambio("manual");
      chevette.setModelo("L");
      chevette.setRegistro("blablabla");
      chevette.acelerar();
      
      Carro corolla = new Carro(false);
      corolla.setFabricante("Toyota");
      corolla.setCambio("automatico");
      corolla.setModelo("SL");
      corolla.setRegistro("bambambam");
      corolla.acelerar();

      Onibus sogal = new Onibus();
      sogal.setFabricante("Scania");
      sogal.setModelo("Veloce");
      sogal.setRegistro("blebleble");
      sogal.acelerar();


      Concessionaria loja = new Concessionaria();
      loja.salvar(chevette);
      loja.salvar(sogal);
      loja.print();
      System.out.println("1 --------------");
      
      loja.atualizar(corolla, "blebleble");
      loja.print();
      System.out.println("2 --------------");
      
      
      loja.salvar(sogal);
      loja.print();
      System.out.println("3 --------------");
      
      loja.deletar("blebleble");
      loja.print(); 
      System.out.println("4 --------------");
      
      loja.deletar("blablabla");
      loja.print();      
      System.out.println("5 --------------");
      
      loja.atualizar(chevette, "bambambam");
      loja.print();
      
      loja.salvar(sogal);
      loja.salvar(corolla);
      loja.print();      
      System.out.println("6 --------------");
      
      Object teste = loja.getByRegistro("blebleble");
      System.out.println(((Veiculo) teste).getFabricante());
  }
}

