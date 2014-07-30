println("Hello World!")

val one = List("A","B","C")
val two = List("D","E","F")
val three = List("G","H","I")

println(one)
println(two)
println(three)

val d = for { a <- one; b <- two; c <- three } yield (a+b+c)

assert( d.size == 27 )
