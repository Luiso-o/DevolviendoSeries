package Series;

public class Serie implements Entregable{
	//Constantes	  
    private final static int temporadasPorDefecto=3;
    public final static int mayor=1;//mas temporadas
    public final static int menor=-1;//menos temporadas
    public final static int igual=0;//igual numero de temporadas
  
    //Atributos
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
  
  //Constructores
  //Por defecto
    public Serie(){
        this("",temporadasPorDefecto, "", "");
    }
  
    //recibiendo como param, titulo y creador
    public Serie(String titulo, String creador){
        this(titulo,temporadasPorDefecto, "", creador);
    }
  
   //recibiendo todos los parametros exepto entregado
    public Serie(String titulo, int numeroTemporadas, String genero, String creador){
        this.titulo=titulo;
        this.numeroTemporadas=numeroTemporadas;
        this.genero=genero;
        this.creador=creador;
        this.entregado=false;
    }
    
    //Métodos 
    public String getTitulo() {
        return titulo;
    }
  
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
  
    public int getnumeroTemporadas() {
        return numeroTemporadas;
    }
  
    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }
  
    public String getGenero() {
        return genero;
    }
  
    public void setGenero(String genero) {
        this.genero = genero;
    }
  
    public String getcreador() {
        return creador;
    }
  
    public void setcreador(String creador) {
        this.creador = creador;
    }
  
    public void entregar() {
        entregado=true;
    }
  
    public void devolver() {
        entregado=false;
    }
  
    //Indica el estado de entregado
    public boolean entregado() {
        if(entregado){
            return true;
        }
        return false;
    }
  
    //compara numero de temporadas de dos series
    public int comparaTemporadas(Object serie) {
        int estado=menor;
  
        //Hacemos un casting de objetos para usar el metodo get
        Serie referencia=(Serie)serie;
        if (numeroTemporadas>referencia.getnumeroTemporadas()){
            estado=mayor;
        }else if(numeroTemporadas==referencia.getnumeroTemporadas()){
            estado=igual;
        }
  
        return estado;
    }
  
     // @return cadena con toda la informacion de la Serie
    public String toString(){
        return "Informacion de la Serie: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tNumero de temporadas: "+numeroTemporadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tCreador: "+creador+"\n";
    }
  
    //compara titulo y creador de dos series
    public boolean equals(Serie serie){
        if (titulo.equalsIgnoreCase(serie.getTitulo()) && creador.equalsIgnoreCase(serie.getcreador())){
            return true;
        }
        return false;
    }
	
}


