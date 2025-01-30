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

Cada clase iría en un archivo independiente.

class Cliente(
    val id: Int,
    val nombre: String,
    val correo: String,
    val direccion: String
) {
    fun realizarPedido() {
        // Lógica para realizar un pedido
    }
}

class Pedido(
    val id: Int,
    val fecha: Date,
    val estado: Estado,
    val costoTotal: Float,
    val listaProductos: List<Producto>
) {
    fun registrarPedido() {
        //Registra el pedido
    }
    fun calcularTotal() {
        // Calcula el precio total
    }
    fun actualizarEstado() {
        //Actualiza el estado del pedido
    }
    fun consultarPedido() {
        //Consulta el pedido
    }
    fun actualizarStockProductos() {
        //Actualiza stock de los productos
    }
}

class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Float,
    val impuestos: Float,
    val stock: Int
) {
    fun registrarProducto() {
        //Registra los productos
    }
    fun actualizarStock() {
        //actualiza el stock
    }
    fun consultarProducto() {
        //consulta el producto
    }
}

class Stock(
    val idProducto: Int,
    val cantidadDisponible: Int
) {
    fun verStock() {
        //VER STOCK DEL PRODUCTO
    }
}

abstract class Pago(
    val id: Int,
    val monto: Float,
    val fecha: Date,
    val formaPago: String
) {
    open fun registrarPago() {
        //registra el pago
    }
    open fun consultarPago() {
        //consulta el pago
    }
}

class PagoTarjeta(
    id: Int,
    monto: Float,
    fecha: Date,
    formaPago: String,
    val numeroTarjeta: String,
    val fechaCaducidad: String,
    val tipoTarjeta: String
) : Pago(id, monto, fecha, formaPago) {
}

class PagoEfectivo(
    id: Int,
    monto: Float,
    fecha: Date,
    formaPago: String,
    val tipoMoneda: String
): Pago(id, monto, fecha, formaPago) {
}

class PagoCheque(
    id: Int,
    monto: Float,
    fecha: Date,
    formaPago: String,
    val banco: String,
    val numeroCheque: String
) : Pago(id, monto, fecha, formaPago){
}

enum class Estado{
    PENDIENTE, PAGADO, CONFIRMADO, ENVIADO, ENTREGADO,
}
