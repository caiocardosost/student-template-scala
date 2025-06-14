package treino_1

val x = 6
val y = 3
def soma(a: Integer, b: Integer): Integer = {
    a+b
}

def sub(a: Integer,b: Integer): Integer = {
    a-b
}

def mul(a: Integer,b: Integer): Integer = {
    a*b
}
@main def main(): Unit = {
    val sm = soma(x,y)
    val sb = sub(x,y)
    val mt = mul(x,y)

    println(s"Soma de $x e $y eh: $sm")
    println(s"Subtracao de $x e $y eh: $sb")
    println(s"multiplicacao de $x e $y eh: $mt")

}

