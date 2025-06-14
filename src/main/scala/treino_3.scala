package treino_3

def max(x: Integer, y: Integer): Integer = {
    val m = if (x>=y) {
        x
    } else {
        y
    }
    m
}
@main def main(): Unit = {
    val valor = max(30,20)
    println(s"max de 30 e 20 eh $valor")    
}