fun testForInLoop(){
    for (x in 1..5){
        println(x)
    }
}

fun testForInLoop2(){
    val min =1
    val max = 6
    var count = 0
    for(i in min..max){
        if(i % 3 == 0){             // 1 % 3 = 1
            count++
        }
    }
    println("Count = "+count)
}

fun testForInLoop3(){
    for(i in 0 until 101 step 20)
        println(i)
}

fun testForInLoop4(){
    for(i in 10 downTo 4){
        println(i)
    }
}

fun testForInLoop5(){
    for (i in 1..5) println(i)
    println()
    for (i in 5..1) println(i)
    println()
    for (i in 5 downTo 1) println(i)
    println()
    for (i in 1..5 step 2) println(i)
    println()
    for (i in 5 downTo 1 step 2) println(i)

}

fun testForLoopArray(){
    var lanquage = arrayOf("Ruby","Kotlin","Python","Java")
    for (item in lanquage){
        println(item +",")
    }
}

fun testForLoopString(){
    var text ="Kotlin"

    for (letter in text){
        println(letter)
    }
}