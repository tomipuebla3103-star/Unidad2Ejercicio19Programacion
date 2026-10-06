public class PerfilUsuario {
    String nombre;
    int pasosAcumulados;
    String[] insigniasObtenidas;
    int cantidadInsignias;

    public PerfilUsuario(String nombre) {
        this.nombre = nombre;
        pasosAcumulados = 0;
        insigniasObtenidas = new String[10];
        cantidadInsignias = 0;
    }

    public void otorgarInsignia(String nombreInsignia) {
        insigniasObtenidas[cantidadInsignias] = nombreInsignia;
        cantidadInsignias++;

        System.out.println("Insignia obtenida: " + nombreInsignia);
    }
}
