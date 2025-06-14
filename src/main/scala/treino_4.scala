package treino_4

val x = 20
val y = 30
val z = 40

def Valorj(a: Double, b: Double): Double = {
    val j = if (a <= b/2) {
        ((b-a)+(b*0.2))
    } else{
        ((b-a)+(b*0.1))
    }
    j
} 

@main def main(): Unit = {
    val j_1 = Valorj(x,y)
    val j_2 = Valorj(x,z)
    println(s"Se devo $y e pago $x, deverei $j_1 com o juros")
    println(s"Se devo $z e pago $x, deverei $j_2 com o juros")


}