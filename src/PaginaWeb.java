import java.time.LocalDateTime;
import java.util.Objects;

public class PaginaWeb {

	private String URL;
	private LocalDateTime FechayHora;

	public PaginaWeb(String uRL, LocalDateTime fechayHora) {
		super();
		URL = uRL;
		FechayHora = fechayHora;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public LocalDateTime getFechayHora() {
		return FechayHora;
	}

	public void setFechayHora(LocalDateTime fechayHora) {
		FechayHora = fechayHora;
	}

	@Override
	public int hashCode() {
		return Objects.hash(FechayHora, URL);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(FechayHora, other.FechayHora) && Objects.equals(URL, other.URL);
	}

	@Override
	public String toString() {
		return "PaginaWeb [URL=" + URL + ", FechayHora=" + FechayHora + "]";
	}

}
