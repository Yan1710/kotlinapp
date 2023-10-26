package com.example.kotlinapp.Exercises

fun main() {
 exercis1()
}
//En el código inicial que se proporciona en el siguiente fragmento de código,
// escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste.
// El mensaje debe incluir lo siguiente:
//
//La cantidad exacta de notificaciones cuando haya menos de 100
//99+ como cantidad de notificaciones cuando haya 100 o más
fun exercis1(){
 val morningNotification = 51
 val eveningNotification = 135

 printNotificationSummary(morningNotification)
 printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
 when (numberOfMessages){
 in 1..99 -> print("Las notificaciones son $numberOfMessages")
 in 99.. 1500 -> println("Las notificaciones son mayores a 99+")

 }

}
