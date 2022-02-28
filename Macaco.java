public class Macaco {
    private double altura;
    private double peso;
    private String pelo;
    private String nome;

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        if(altura >5.0){
            System.out.println("é gigante");
        }else{
            System.out.println("esta crescendo bem!");
        }
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if(peso >0){
           this.peso = peso/2+6; 
        }else{
            peso = 0;
        }
    }

    public String getPelo() {
        return this.pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
