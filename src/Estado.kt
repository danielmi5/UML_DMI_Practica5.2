enum class Estado {
      PENDIENTE, PAGADO, CONFIRMADO, ENVIADO, ENTREGADO, ;

     override fun toString(): String {
         return super.toString().lowercase()
     }

}