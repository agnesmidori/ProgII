public class Carro extends Veiculo {
    private boolean isSedan = false;

    public String getCombustivel() {
        return "Gasolina";
    }

    public Carro(boolean isSedan){
        super.setTipo("veiculo de passeio");
        isSedan = true;
    }

	public boolean isSedan() {
		return isSedan;
	}
                                
    public String getDetalhes(Veiculo veic){
        return (super.getDetalhes(veic) +  " Ã‰ Sedan ou Compacto: " + (isSedan ? "Sedan" : "Compacto")) ; 
    }
    
    public abstract void acelerar() {
    	boolean acelerar = false;
    	
    	
    	System.out.println ("")
    	
    }

}
