package Series;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		
		//lista de series usando los tres constructores
		ArrayList<Serie>listaSeries=new ArrayList<Serie>();
		listaSeries.add(new Serie());
		listaSeries.add(new Serie("Juego de tronos", "George R. R. Martin "));
		listaSeries.add(new Serie("Los Simpsons", 25, "Humor", "Matt Groening"));
		listaSeries.add(new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane"));
		listaSeries.add(new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan"));
		
		//lista de Video Juegos usando los tres constructores
		ArrayList<Videojuego>listaVideojuegos=new ArrayList<Videojuego>();
		listaVideojuegos.add(new Videojuego());
		listaVideojuegos.add(new Videojuego("Assasin creed 2", 30, "Aventura", "EA"));
		listaVideojuegos.add(new Videojuego("God of war 3", "Santa Monica"));
		listaVideojuegos.add(new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo"));
		listaVideojuegos.add(new Videojuego("Final fantasy X", 200, "Rol", "Square Enix"));
		
        //entregamos algunos videojuegos y series
		listaSeries.get(0).entregar();
		listaSeries.get(2).entregar();
		listaVideojuegos.get(1).entregar();
		listaVideojuegos.get(3).entregar();
	
   //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos
      int entregados=0;

      for(int i=0; i<listaSeries.size(); i++){
          if(listaSeries.get(i).entregado()){
              entregados+=1;
              listaSeries.get(i).devolver();

          }
          if(listaVideojuegos.get(i).entregado()){
              entregados+=1;
              listaVideojuegos.get(i).devolver();
          }
      }
	
  
        System.out.println("Hay "+entregados+" articulos entregados");
  
    //Creamos dos objetos con la primera posicion de cada array       
      Serie seriemayor=listaSeries.get(0);
      Videojuego videojuegomayor=listaVideojuegos.get(0);

      //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
      for(int i=1; i<listaSeries.size(); i++){
          if(listaSeries.get(i).comparaTemporadas(seriemayor)==Serie.mayor){
              seriemayor=listaSeries.get(i);
          }
          if(listaVideojuegos.get(i).comparaTemporadas(videojuegomayor)==Videojuego.mayor){
              videojuegomayor=listaVideojuegos.get(i);
          }

      }
         
       //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println(videojuegomayor);
        System.out.println(seriemayor);

			

	}

}
