ºººpackage BoletinOrdenaciones1;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Agenda {
	private Map<String, Contacto> contactos;

	public Agenda() {
		this.contactos = new TreeMap<String, Contacto>();
	}

	public boolean agregarContacto(Contacto contacto) {
		for (Contacto c : contactos) {
			if (c.getTelefono().equals(contacto.getTelefono())) {
				System.out.println("Error: El teléfono ya está asignado a otro contacto.");
				return false;
			}
		}
		return contactos.add(contacto);
	}

	public boolean eliminarContacto(String nombre, String apellidos) {
		Contacto temp = new Contacto(nombre, apellidos, "", "", "");
		for (Contacto c : contactos) {
			if (c.equals(temp)) {
				contactos.remove(c);
				return true;
			}
		}
		return false;
	}

	public Contacto buscarPorNombre(String nombre, String apellidos) {
		for (Contacto c : contactos) {
			if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellidos().equalsIgnoreCase(apellidos)) {
				return c;
			}
		}
		return null;
	}

	public Contacto buscarPorTelefono(String telefono) {
		for (Contacto c : contactos) {
			if (c.getTelefono().equals(telefono)) {
				return c;
			}
		}
		return null;
	}

	public void mostrarContactos() {
		for (Contacto c : contactos) {
			System.out.println(c);
		}
	}
}

