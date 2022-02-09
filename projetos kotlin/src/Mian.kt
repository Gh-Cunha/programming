fun calculaBonus(cargo: String, salario: Float): Float {
    // Gerente Junior,Gerente Senior,  Coordenador

    return if (cargo == "Coordenador") {
         salario * 0.2f
    } else if (cargo == "Gerente Junior") {
          salario * 0.5f
    } else {
         salario * 2
    }

}

fun main() {


    val valor = 10
    // String str = valor == 10 ? "Sim" : "Não"
    val str = if (valor == 10) "Sim" else "Não"

    // Operador Elvis
    val test: Int? = null
    val op: Int = test ?: 100
    println(op)

    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Junior", 1000f))
    println(calculaBonus("Gerente Senior", 1000f))
}




