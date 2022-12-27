// @autor : Wilson LLivicura - M4A
// mensaje de confirmación desde el editor de github

fun main(args: Array<String>) {
    val resultadoLista = ordenarElementos()
    val listaOrdenada = resultadoLista.sorted()
    println("LISTA ORDENADA: $listaOrdenada")
}

fun ordenarElementos() : MutableList<Int>{
    var datos: MutableList<Int> = mutableListOf()
    for (valor in 1..10) {
        print("Ingrese el $valor valor: ")
        var entradaDato = readln().toInt()
        datos.add(entradaDato)
    }
    return datos
}
