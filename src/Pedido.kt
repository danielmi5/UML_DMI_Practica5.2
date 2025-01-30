import java.util.Date

class Pedido(
    val fecha: Date
) {
    var id: Int = cont
        private set
    var estado: Estado = Estado.PENDIENTE
    var costoTotal: Float = 0f
    val listaProductos: MutableList<Map<Producto, Int>> = mutableListOf()
    init {
        ++cont
    }

    companion object{
        var cont = 1
    }

    fun registrarPedido() {
        calcularTotal()
        println("Pedido $id registrado con éxito.")
    }

    fun calcularTotal() {
        var total = 0f
        for (mapa in listaProductos) {
            mapa.keys.forEach {total += (it.precio + it.impuestos)*(mapa[it] ?:1)}
        }
        costoTotal = total
    }

    fun actualizarEstado(nuevoEstado: Estado) {
        // Actualiza el estado del pedido
        estado = nuevoEstado
        println("El estado del pedido ahora es: $estado")
    }

    fun consultarPedido() {
        println("Pedido $id - Estado: $estado - Total: $costoTotal - Productos: $listaProductos")
    }

    fun actualizarStockProductos() {
        listaProductos.forEach { mapa -> mapa.keys.forEach { it.actualizarStock(mapa[it] ?:0)  } }
    }
}
