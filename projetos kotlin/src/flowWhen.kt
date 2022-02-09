fun operacao (a: Int, b: Int, c: String)  {
    /*
    when (c) {
        "soma" -> return a + b
        "subtração" -> {
            return a - b
        }
        else ->  {
            println("Operação Incorreta")
            return 0
        }
    }
    */

    when {
        a > 0 && b > 0 -> {
            println("variaveis maiores que zero")
        }
    }

    when {
      a in 1..99 && b > 0 -> {
            println("século")
        }
    }
}

fun main() {
    operacao( a = 10, b =  10, c = "Soma")
    operacao( a = 10, b =  10, c = "Subtração")

    operacao(a = 10, b =  10, c = "Soma")
}