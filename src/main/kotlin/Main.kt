fun main(args: Array<String>) {
    println("Введите первое число")
    var num1 = readln().toInt()
    println("Введите второе число")
    var num2 = readln().toInt()

    val numPlus = num1 + num2

    if (numPlus % 2 != 0)
    {
        println("Нечетное число из чисел: " + (num1 + num2))
    }
    else
    {
        println("Создать нечетное число невозможно")
    }
}