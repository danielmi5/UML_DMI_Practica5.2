import java.util.Date

abstract class Pago(
    val id: Int,
    val monto: Float,
    val fecha: Date,
    val formaPago: String
) {
    open fun registrarPago() {
        println("Pago registrado")
    }

    open fun consultarPago() {
        //consulta el pago
        println("Id: $id - Monto: $monto - Fecha: $fecha - formaPago: $formaPago")
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
    override fun consultarPago() {
        println("Id: $id - Monto: $monto - Fecha: $fecha - formaPago: $formaPago - NumeroTarjeta: $numeroTarjeta - fechaCaducidad: $fechaCaducidad - TipoTarjeta: $tipoTarjeta")
    }
}

class PagoEfectivo(
    id: Int,
    monto: Float,
    fecha: Date,
    formaPago: String,
    val tipoMoneda: String
): Pago(id, monto, fecha, formaPago){
    override fun consultarPago() {
        println("Id: $id - Monto: $monto - Fecha: $fecha - formaPago: $formaPago - Tipo moneda: $tipoMoneda")
    }
}

class PagoCheque(
    id: Int,
    monto: Float,
    fecha: Date,
    formaPago: String,
    val banco: String,
    val numeroCheque: String
) : Pago(id, monto, fecha, formaPago){
    override fun consultarPago() {
        println("Id: $id - Monto: $monto - Fecha: $fecha - formaPago: $formaPago - Banco: $banco - numCheque: $numeroCheque")
    }
}
