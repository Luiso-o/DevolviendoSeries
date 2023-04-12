package Series;

public class Videojuego implements Entregable{
	//Constantes
    private final static int HORAS_ESTIMADAS_DEF=100;
    public final static int mayor=1;//mas temporadas
    public final static int menor=-1;//menos temporadas
    public final static int igual=0;//igual numero de temporadas
  
    //Atributos
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;
  
    //Constructor
   //por defecto
    public Videojuego(){
        this("",HORAS_ESTIMADAS_DEF, "", "");
    }
  
   //pidiendo titulo y compañia como parametros
    public Videojuego(String titulo, String compañia){
        this(titulo,HORAS_ESTIMADAS_DEF, "", compañia);
    }
  
    //todos los parametros exepto entregado
    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compañia=compañia;
        this.entregado=false;
    }
    
    
    //Métodos publicos
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
  
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
  
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }
  
    public void setGenero(String genero) {
        this.genero = genero;
    }
  
    public String getcompañia() {
        return compañia;
    }

    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }
  
   //cambia el estado de entregado a true
    public void entregar() {
        entregado=true;
    }
  
   //Cambia el estado de entregado a false    
    @Override
    public void devolver() {
        entregado=false;
    }
  
    //Indica el estado de entregado
    @Override
    public boolean entregado() {
        if(entregado){
            return true;
        }
        return false;
    }
  
    //compara numero de temporadas de dos videoJuegos
    @Override
    public int comparaTemporadas(Object video) {
        int estado=menor;
  
        //Hacemos un casting de objetos para usar el metodo get
        Videojuego ref=(Videojuego)video;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=mayor;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=igual;
        }
  
        return estado;
    }
  
    //cadena de informacion del videoJuego
    @Override
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compañia+"\n";
    }
  
    //compara titulo y creador de dos series
    public boolean equals(Videojuego video){
        if (titulo.equalsIgnoreCase(video.getTitulo()) && compañia.equalsIgnoreCase(video.getcompañia())){
            return true;
        }
        return false;
    }
	
}
