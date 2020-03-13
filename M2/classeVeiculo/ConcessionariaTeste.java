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
      System.out.println("--------------");
      
      loja.atualizar(corolla, "blebleble");
      loja.print();
      System.out.println("--------------");
      
      loja.deletar("blablabla");
      loja.deletar("blebleble");
      loja.print();      
      System.out.println("--------------");
      
      loja.atualizar(chevette, "bambambam");
      loja.print();

  }
}
