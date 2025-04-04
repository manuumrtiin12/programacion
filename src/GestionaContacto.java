package BoletinOrdenaciones;

public class GestionaContacto {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.agregarContacto(new Contacto("Juan", "Perez", "juan.perez@email.com", "Calle 123", "123456789"));
        agenda.agregarContacto(new Contacto("Ana", "Gomez", "ana.gomez@email.com", "Avenida 456", "987654321"));
        agenda.agregarContacto(new Contacto("Luis", "Martinez", "luis.martinez@email.com", "Calle 789", "111222333"));
        
        System.out.println("Contactos en la agenda:");
        agenda.mostrarContactos();
        
        System.out.println("\nBuscando a Juan Perez:");
        Contacto buscado = agenda.buscarPorNombre("Juan", "Perez");
        System.out.println(buscado != null ? buscado : "Contacto no encontrado.");
        
        System.out.println("\nBuscando por teléfono 987654321:");
        Contacto porTelefono = agenda.buscarPorTelefono("987654321");
        System.out.println(porTelefono != null ? porTelefono : "Teléfono no encontrado.");
    }
}