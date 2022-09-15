public class Pokemon {
    private Integer numero;
    private String nombre;
    private String tipo;
    private Double peso;
    private Double altura;
    private Integer ps;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getPs() {
        return ps;
    }

    public void setPs(Integer ps) {
        this.ps = ps;
    }

    public void imprimir(){
        System.out.println("Numero: "+ getNumero());
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Peso: "+ getPeso());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Ps: "+ getPs());
    }
}
