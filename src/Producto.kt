class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Float,
    val impuestos: Float,
) {
    private var stock: Int = 60
    fun registrarProducto() {
        println("Producto $nombre registrado con éxito.")
    }

    fun actualizarStock( numProducto: Int) {
        if (stock > 0) {
            stock -= numProducto
            println("Stock de $nombre actualizado: $stock unidades restantes.")
        } else {
            println("No hay stock suficiente para $nombre.")
        }
    }

    fun consultarProducto() {
        // Consulta el producto y muestra su información
        println("Producto: $nombre, Descripción: $descripcion, Precio: $$precio, Stock: $stock")
    }

    override fun toString(): String {
        return "Producto(id = $id, nombre = $nombre, descripción = $descripcion, $precio = $precio, impuestos = $impuestos, stock = $stock)"
    }
}
