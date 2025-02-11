package orientacion_objeto_2;

import java.time.LocalDate;

public class GestionaProfesor3 {

	

ProfesorInterino3 interino1 = new ProfesorInterino3 ("Pepe", "Inglés", LocalDate.now().plusMonths (6)); 
Profesor3 interino2 = new ProfesorInterino3 ("Pepa", "Historia", LocalDate.now().plusMonths (4));

System.out.println(interino1.getFecha FinContrato());

ProfesorInterino3 p3= (ProfesorInterino) interino2; //Down Casting Del tipo padre convierto al tipo hijo 
System.out.println(p3.getFechaFinContrato());

ProfesorTitular titular1 = new Profesor Titular ("Antonio", "Filosofía", LocalDate.now(). minus Years(1)); 
System.out.println(titular1.getFechaAdjudicacionPlaza());
Profesor titular2= new Profesor Titular ("Antonia", "Lengua", LocalDate.now(). minus Years(1)); 
ProfesorTItular p4 = (ProfesorTitular) titular2; System.out.println(p4.getFechaAdjudicacionPlaza());

}
