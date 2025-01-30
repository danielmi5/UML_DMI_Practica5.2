class Cliente(
    val id: Int,
    val nombre: String,
    val correo: String,
    val direccion: String
) {
    val listaPedidos: MutableList<Pedido> = mutableListOf()

    fun realizarPedido(pedido: Pedido, listaProductos: List<Map<Producto, Int>>, pago: Pago) {
        // Verificar si el pago es válido
        if (pago.monto >= pedido.costoTotal) {
            // Registra el pago
            pago.registrarPago()

            listaProductos.forEach { pedido.listaProductos.add(it)}
            pedido.actualizarStockProductos()

            listaPedidos.add(pedido)
            pedido.registrarPedido()

            // Actualiza el estado del pedido a "PAGADO"
            pedido.actualizarEstado(Estado.PAGADO)

            println("Pedido realizado exitosamente")
        } else {
            println("Fondos insuficientes para completar el pedido.")
        }
    }
}
