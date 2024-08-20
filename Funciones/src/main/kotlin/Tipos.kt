/*
Nombre: Wilmer Moncada Parra
ID: 702523
Ing. sistemas
 */


var estado = true

fun menu() {
    while (estado) {
        println("Menú:")
        println("1. Suma")
        println("2. Resta")
        println("3. Raíz")
        println("4. Cuadrado")
        println("5. División")
        println("6. Salir")
        print("Digite una opción: ")
        val op = readln().toInt()

        when (op) {
            1 -> suma()
            2 -> resta()
            3 -> println("La raíz es: ${raiz()}")
            4 -> println("El cuadrado es: ${cuadrado()}")
            5 -> {
                print("Ingrese el primer número: ")
                val num1 = readln().toDouble()
                print("Ingrese el segundo número: ")
                val num2 = readln().toDouble()
                division(num1, num2)
            }
            6 -> {
                println("Saliendo del programa...")
                estado = false
            }
            else -> println("Opción no válida, por favor intente de nuevo.")
        }
    }
}

fun menu1(){
    menu()
}
fun main(){    // colocar un menu que tenga la opcion de salir
    suma()
    resta()
    println("La raiz es: ${raiz()}")
    println(cuadrado())
    division(12.0,2.0)
}

fun suma(){
    var n1 = 1
    var n2 = 2
    var suma = n1 + n2
    println("la suma es: $suma")
}

fun resta(){
   var n1 = 12
   var n2 = 6
   var resta = n1 - n2
    println("La resta es: $resta")
}

fun raiz():Double{
    return Math.sqrt(12.0)
}
var n3 = 12.0
fun cuadrado(): Double{
    return Math.pow(n3,2.0)
}

fun division(numero1:Double,numero2:Double){
    var div = numero1/numero2
    println("La division es: ${div}")
}


