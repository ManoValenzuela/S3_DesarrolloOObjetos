Duoc UC
🧠 Evaluación Sumativa Semana 3 – Desarrollo Orientado a Objetos I
👤 Autor del proyecto
Nombre completo: Manola Valenzuela González
Sección: 002A
Carrera: Analista Programador Computacional
Sede: Online
📘 Descripción general del sistema
Este proyecto modela la estructura básica de la empresa salmonera Salmontt, ubicada en Puerto Montt.
El sistema representa las personas que interactúan con la organización —como empleados y clientes— aplicando principios de Programación Orientada a Objetos: encapsulamiento, composición, reutilización y organización modular del código.

El objetivo es construir una base sólida para futuras etapas del sistema, permitiendo gestionar la información de las personas de manera estructurada y extensible.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.

En futuras versiones, se podrían realizar mejoras en el proyecto implementando herencias entre las clases, Persona, Cliente y Empleado.

🧱 Estructura general del proyecto
📁 src/
├── app/         # Clase principal con el método main
├── model/       # Clases de dominio (Persona, Cliente, Empleado, Domicilio, etc.)

⚙️ Ejecución del programa

Desde IntelliJ IDEA, ejecutar la clase Main ubicada en el paquete app.

💬 Ejemplo de salida esperada
=== EMPLEADOS ===
Empleado: Celia
Edad: 45
Dirección: Vivaceta 10 Rancagua Libertador Bernardo O'Higgins
RUT: 11998877-3
Correo: celia@mail.com
Teléfono: +5693322678
Cargo: vendedor
Sueldo: 900000

Empleado: Pedro
Edad: 50
Dirección: San Francisco 35 Valdivia Los Ríos
RUT: 123456987-1
Correo: pedro@mail.com
Teléfono: 98765432
Cargo: supervisor
Sueldo: 1500000

=== CLIENTES ===
Cliente: Ahsoka
Edad: 25
Dirección: Viel 15 Santiago Metropolitana
RUT: 25123456-0
Correo: ahsoka@mail.com
Teléfono: 22224444
Nuevo Cliente: Sí
Categoría: Restaurantes

🧠 Conceptos aplicados

Encapsulamiento: uso de atributos privados con getters y setters.
Composición: Persona contiene un objeto Direccion; Empleado y Cliente contienen un objeto Persona.
Sobrescritura de métodos (toString()): para mostrar información legible de los objetos.
Organización modular: clases separadas en paquetes model y app

Repositorio GitHub: https://github.com/ManoValenzuela/S3_DesarrolloOObjetos.git Fecha de entrega: [10/11/2025]

© Duoc UC | Escuela de Informática y Telecomunicaciones
