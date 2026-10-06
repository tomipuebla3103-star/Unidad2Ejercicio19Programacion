//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PerfilUsuario usuario =
            new PerfilUsuario("Tomas");

    PulseraInteligente pulsera =
            new PulseraInteligente(usuario);

    pulsera.registrarPasos(6000);
    pulsera.registrarPasos(5000);

    System.out.println();
    System.out.println("Usuario: " + usuario.nombre);
    System.out.println("Pasos totales: " +
            usuario.pasosAcumulados);

    System.out.println("Insignias:");

    for (int i = 0; i < usuario.cantidadInsignias; i++) {
        System.out.println(
                usuario.insigniasObtenidas[i]
        );
    }
}
