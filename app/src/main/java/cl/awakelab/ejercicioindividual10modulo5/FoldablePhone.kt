package cl.awakelab.ejercicioindividual10modulo5

class FoldablePhone(isScreenLightOn : Boolean = false, var isFolded : Boolean = false) : Phone(isScreenLightOn) {

    override fun switchOn() {

        if(!isFolded) {
            super.switchOn()
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }

}

fun main() {

    val foldable = FoldablePhone()

}
