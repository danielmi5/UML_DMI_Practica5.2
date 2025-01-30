import java.util.Date
fun main(){
    // Crear productos
    val producto1 = Producto(1, "Laptop", "Laptop con 16GB RAM", 800f, 50f)
    val producto2 = Producto(2, "Mouse", "Mouse óptico", 20f, 5f)
    val mapaProductos = listOf(mapOf(producto1 to 3), mapOf(producto2 to 2))
    val mapaProductos2 = listOf(mapOf(producto1 to 10))
    // Crear un pedido
    val pedido = Pedido(Date(1000L))

    // Crear un pago con tarjeta
    val pago = PagoTarjeta(1, 900f, Date(), "Tarjeta de Crédito", "1234567812345678", "12/25", "Visa")
    // Cliente creado y realizado dos pedidos
    val cliente = Cliente(1, "Juan Pérez", "juan@correo.com", "Calle Ficticia 123")
    cliente.realizarPedido(pedido, mapaProductos, pago)

    //actualizo el pedido 1 a pagado
    pedido.actualizarEstado(Estado.ENTREGADO)

    cliente.realizarPedido(Pedido(Date(100L)), mapaProductos2, pago)
    println()
    // Consultar el estado de los pedidos del cliente

    cliente.listaPedidos.forEach {it.consultarPedido()}

    // Consultar detalles del pago
    pago.consultarPago()

}