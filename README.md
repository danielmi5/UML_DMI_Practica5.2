# UML_DMI_Practica5.2

## Diagrama UML

![Diagrama UML](archivos/practica5_2.png)

## Apartado A 

- **Clase** → Clase en POO: Representa una entidad con atributos y métodos. Ej -> Cliente
- **Atributo**  → Variable de instancia: Define el estado o propiedades de una clase. Ej -> id
- **Objeto** → Instancia de una Clase: Un objeto creado a partir de una clase. Ej -> De `Producto` se puede crear un objeto "Laptop".
- **Operación** → Método: Representa una función o comportamiento de la clase. Ej -> realizarPedido()
- **Asociación** → Relación entre objetos: Conexión entre clases, equivalente a referencias o atributos de tipo objeto. Ej -> `Pedido` está asociado a un `Cliente`
- **Agregación**: Representa una relación débil entre clases, donde una puede existir sin la otra. Ej -> Pedido tiene `listaProductos`, sin pedido, `Producto` sigue existiendo
- **Composición**: Aquí no puede existir sin la otra EJ -> Pedido tiene `listaProductos`, sin productos, no puede existir
- **Herencia** → Herencia en POO: Representa la relación padre-hijo entre clases, donde una subclase hereda atributos y métodos de la superclase. EJ -> La clase Pago tiene tres subclases (Efectivo, Tarjeta, Cheque)
- **Interfaz** → Interfaz en POO: Define un conjunto de métodos sin implementación que deben ser implementados por las clases que la usan (como un contrato).
- **Dependencia** → Uso de una clase dentro de otra: Representa una relación en la que un objeto depende de otro para funcionar.
- **Realización** → Implementación de una interfaz: Conexión entre una interfaz y la clase que la implementa.
- **Estado** → Patrón de estado: Mapea el concepto de una máquina de estados a objetos con diferentes comportamientos según su estado. Ej -> Un `Pedido` puede cambiar de estado (Pendiente, Enviado, Entregado...).

## APARTADO B

Elegí Draw.io porque es una herramienta gratuita, fácil de usar y accesible desde cualquier navegador sin necesidad de instalar nada. Es intuitiva y tiene plantillas predefinidas para diagramas UML, lo que facilita la creación de diagramas haciendo más rápido el proceso.


## APARTADO C

Cada clase iría en un archivo independiente. Para crear una clase de un diagrama UML a POO (Kotlin). 
En la caja de cada clase hay 3 cuadros. El primero es el nombre de la clase, el segundo son los atributos y el tercero son los métodos. 

Para crear una clase en Kotlin es: ()
class nombreClase ( val o var nombreAtributo: tipoValor)  
Añadir que +, -, # para UML es: public, private, protected para POO.
Por ejemplo: Una clase privada sería "private class"

enum class Estado{
    PENDIENTE, PAGADO, CONFIRMADO, ENVIADO, ENTREGADO,
}
