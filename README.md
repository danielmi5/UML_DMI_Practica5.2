# UML_DMI_Practica5.2

## Diagrama UML

![Diagrama UML](archivos/practica5_2.pdf)

## Apartado A 

-**Clases**: Pedido, Producto, Pago, Cliente
-**Objetos**: Camiseta, Zapatos, Pedido123, Pago1
-**Atributos**: nombre, precio, stock (en la clase Producto), id_pedido, estado.
-**Métodos**: registrar_pedido(), calcular_total(), actualizar_estado()
-**Relaciones**:
-**Asociación**: Cliente → Pedido (Cliente accede a Pedido para realizarlo), Pedido → Producto (Pedido accede a productos)
-**Composición**: Pedido → Producto (un pedido contiene productos, y si el pedido se elimina, los productos pueden dejar de estar disponibles para ese pedido)
Herencia: Efectivo, Tarjeta y Cheque son subclases de la clase Pago
Dependencias: Pedido depende de Producto para calcular el total.
Visibilidad: Atributos y métodos como public(+), private(-), protected() en las clases.


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
