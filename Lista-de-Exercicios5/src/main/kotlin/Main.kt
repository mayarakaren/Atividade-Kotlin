//Construa um programa que apresente o valor de H, sendo H calculado por:
//H = 1 + 2 + 3 + 4 + ... + N
//O valor de N será apresentado pelo usuário.

fun main() {
    print("Digite o valor de N: ")
    val n = readLine()?.toIntOrNull()

    if (n != null) {
        var h = 0

        for (i in 1..n) {
            h += i
        }

        println("O valor de H é $h")
    } else {
        println("Valor de N inválido.")
    }
}
