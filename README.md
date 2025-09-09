# 1.1-Herencia-y-Polimorfismo-Nivel1

📄 **Descripción - Enunciado del ejercicio**

Este proyecto contiene la resolución de los siguientes ejercicios de Java:

### Ejercicio 1
En un grupo de música existen diferentes tipos de instrumentos musicales: viento, cuerda y percusión.  
Todos los instrumentos tienen como atributos su nombre y precio, además de un método `play()`.  
El método es abstracto en la clase `Instrument` y debe implementarse en las clases hijas.  

- Si se está tocando un instrumento de viento, debe mostrar: `"Está sonando un instrumento de viento"`.  
- Si se está tocando un instrumento de cuerda, debe mostrar: `"Está sonando un instrumento de cuerda"`.  
- Si se está tocando un instrumento de percusión, debe mostrar: `"Está sonando un instrumento de percusión"`.  

Además, se debe demostrar que el proceso de carga de una clase solo ocurre una vez, ya sea por la creación de la primera instancia o por el acceso a un miembro estático.  

Se pide investigar sobre los bloques de inicialización y bloques estáticos en Java.

---

### Ejercicio 2
Crea una clase `Car` con los atributos:
- **brand** → `static final`  
- **model** → `static`  
- **horsePower** → `final`  

Se debe demostrar la diferencia entre los tres y responder a la pregunta: ¿alguno puede inicializarse en el constructor?  

Añadir dos métodos:
- Un método **estático** `brake()` que muestre: `"The vehicle is braking"`.  
- Un método **no estático** `accelerate()` que muestre: `"The vehicle is accelerating"`.  

Desde `main()`, invocar correctamente ambos métodos.

---

💻 **Tecnologías Utilizadas**
- Java 17  
- IntelliJ IDEA (como IDE de desarrollo)  
- Git & GitHub (control de versiones y repositorio remoto)

---

📋 **Requisitos**
- JDK 17 o superior instalado  
- IntelliJ IDEA (recomendado) o cualquier editor compatible con Java  
- Git para clonar el repositorio  

---

🛠️ **Instalación**
1. Clonar este repositorio:
   ```bash
   git clone https://github.com/leilaweicman/1.1-Herencia-y-Polimorfismo-Nivel1.git
   ```
2. Acceder al directorio del proyecto:
   ```bash
   cd 1.1-Herencia-y-Polimorfismo-Nivel1
   ```
3. Abrir el proyecto en IntelliJ IDEA.

---

▶️ **Ejecución**
1. Ir al archivo Main.java dentro del paquete correspondiente.
2. Ejecutar el método main() con el botón ▶ en IntelliJ IDEA o desde la terminal:
   ```bash
   java Main
   ```
3. Observar en consola la salida de cada ejercicio.

---

🌐 **Despliegue**

Este proyecto es de práctica en entorno local, no requiere despliegue en servidor.

---

🤝  **Contribuciones**

Las contribuciones son bienvenidas. Para colaborar:

1. Haz un fork del repositorio.
2. Crea una nueva rama:
  ```bash
   git checkout -b feature/NuevaFuncionalidad
   ```
3. Realiza tus cambios y haz commit:
  ```bash
   git commit -m "Descripción clara del cambio"
   ```
4. Sube tus cambios:
  ```bash
   git push origin feature/NuevaFuncionalidad
   ```
5. Abre un Pull Request en GitHub.

