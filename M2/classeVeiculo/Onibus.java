public class Onibus extends Veiculo {
    private int capacidade;
  
    public String getCombustivel() {
        return "Diesel";
    }

    public Onibus(){
        super.setTipo("onibus");
        super.setCambio("automatico");
    }

    public String getDetalhes(Veiculo veic){
        return super.getDetalhes(veic) + "Capacidade: " + this.getCapacidade() ; 

    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public void acelerar() {
    	System.out.println("A velocidade máxima é de 120 km/h.");
	}

}
