<img width="560" height="227" alt="WhatsApp Image 2026-10-06 at 00 01 14" src="https://github.com/user-attachments/assets/db1fe48c-05ba-4831-ba41-ebac2e1ed242" />

La Aplicación de Fitness y Seguimiento de Metas

Descripción
Este proyecto consiste en un sistema en Java que simula el funcionamiento de una pulsera inteligente que registra los pasos diarios de una persona. Cuando el usuario alcanza una meta de pasos, la pulsera envía un mensaje a su perfil para otorgarle una insignia virtual.

Clases
- **PerfilUsuario:** almacena el nombre, los pasos acumulados y la lista de insignias obtenidas. Contiene el método `otorgarInsignia(String nombreInsignia)`, que agrega una nueva insignia al perfil.
- **PulseraInteligente:** mantiene una referencia al perfil del usuario y registra los pasos mediante el método `registrarPasos(int cantidad)`. También verifica si se alcanzó la meta diaria.

Funcionamiento
En el `main` se crea un perfil de usuario y una pulsera inteligente asociada. Luego, se simula el registro de una cantidad de pasos. Si se alcanza la meta diaria, la pulsera envía un mensaje al perfil para otorgar la insignia correspondiente. Finalmente, se muestran por consola los pasos acumulados y las insignias obtenidas.

Recorrido del mensaje
1. El programa crea el perfil del usuario con sus datos iniciales.
2. Se crea la pulsera inteligente y se la asocia al perfil.
3. La pulsera registra los pasos mediante el método `registrarPasos()`.
4. La cantidad de pasos se suma al total acumulado del usuario.
5. La pulsera verifica si se alcanzó la meta diaria establecida.
6. Si se cumple la meta, envía un mensaje al perfil mediante `otorgarInsignia()`.
7. El perfil agrega la insignia a su lista y muestra los resultados por consola.

 Validaciones
El sistema debe comprobar que la cantidad de pasos registrada sea válida y evitar otorgar repetidamente la misma insignia por cumplir una única meta diaria.

 Objetivo
Practicar la comunicación entre objetos en Java, el uso de referencias entre clases, la actualización de atributos, el manejo de listas y la notificación automática cuando se cumple una meta.
