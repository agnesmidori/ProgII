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


      Onibus sogal = new Onibus();
      sogal.setFabricante("Scania");
      sogal.setModelo("Veloce");


      Concessionaria loja = new Concessionaria();
      loja.salvar(chevette);
      loja.salvar(sogal);

      loja.print();

  }
}
