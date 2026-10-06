public class PulseraInteligente {
    PerfilUsuario perfil;

    public PulseraInteligente(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public void registrarPasos(int cantidad) {
        perfil.pasosAcumulados = perfil.pasosAcumulados + cantidad;

        System.out.println("Pasos registrados: " + cantidad);
        System.out.println("Pasos acumulados: " + perfil.pasosAcumulados);

        if (perfil.pasosAcumulados >= 10000) {
            perfil.otorgarInsignia("Meta de 10.000 pasos");
        }
    }
}
