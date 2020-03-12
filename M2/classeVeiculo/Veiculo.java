public abstract class Veiculo {
    private String fabricante;
    private String modelo;
    private String cambio;
    private String motor;
    private String combustivel;
    private String marchas;
    private String tipo;
    private String registro;

    public String getCambio() {
        return cambio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(final String fabricante) {
        this.fabricante = fabricante;
    }

    public void setCambio(final String cambio) {
        this.cambio = cambio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(final String motor) {
        this.motor = motor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(final String combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarchas() {
        return marchas;
    }

    public void setMarchas(final String marchas) {
        this.marchas = marchas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalhes(Veiculo veic){
      return ( this.getTipo() + " " + this.getFabricante() + " " +  this.getModelo());

    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    //Método abstract
    public abstract void acelerar();
}
