package org.iesra

class Robot(val nombre : String) {
    init{
        require(nombre.isNotBlank()){"Error. El nombre del robot no puede estar vacío."}
    }
    var posX : Int = 0
    var posY : Int = 0
    var direccionActual : Direcciones = Direcciones.PositiveY
    var posicionActual : IntArray = intArrayOf(0,0)

    fun mover(movimiento : IntArray) {
        for(num in movimiento) {
            when(direccionActual) {
                Direcciones.PositiveY -> if(num >= 0) posY + num else posY -= num
                Direcciones.NegativeX -> if(num < 0) posX + num else posX -= num
                Direcciones.NegativeY -> if(num < 0) posY + num else posY -= num
                Direcciones.PositiveX -> if(num >= 0) posX + num else posX -= num
            }
            direccionActual = obtenerSiguienteDireccion()
        }
        posicionActual = obtenerPosicion()
    }

    fun obtenerPosicion() : IntArray{
        val posicionInicial : IntArray = intArrayOf(posX, posY)
        return posicionInicial
    }

    fun obtenerSiguienteDireccion(): Direcciones {
        val indicesDirecciones: Array<Direcciones> = Direcciones.values()
        val indiceDireccionActual: Int = indicesDirecciones.indexOf(direccionActual)
        val indiceSiguienteDireccion: Int = (indiceDireccionActual + 1) % indicesDirecciones.size
        return indicesDirecciones[indiceSiguienteDireccion]
    }

    override fun toString(): String {
        return "$nombre está en (${posX}, ${posY}) $direccionActual"
    }
}