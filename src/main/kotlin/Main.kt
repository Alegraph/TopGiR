const val FLAG = true
fun main(args: Array<String>) {
    println("Hello World!")
    /*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*/
    //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
    //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
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")

    val userName: String = "Natasha"
    var lastName = "Popova"
    var age = 27

    println("Меня зовут $userName $lastName и мне $age лет")
    age += 1
    // вышда замуж и сменила фамилию на Петрова
    lastName = "Petrova"
    println("Теперь меня зовут $userName $lastName и мне $age лет")

    val i = 4
    val d = 4.0
    val s = "HackerRank "

    val i2 = readLine()!!.toInt()
    val d2 = readLine()!!.toDouble()
    val s2 = readLine()!!.toString()

    println(i + i2)
    println(d + d2)
    println(s + s2)

}