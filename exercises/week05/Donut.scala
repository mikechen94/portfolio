/**
  * Created by Eric's laptop on 12/04/2017.
  */
println("Step 1: How to define a simple class to represent a Donut object")
class Donut(name: String, productCode: Long){

  def print = println(s"Donut name = $name, productCode = $productCode")

}
println("\nStep 2: How to declare a companion object for the Donut class")
object Donut {

  def apply(name: String, productCode: Long): Donut = {
    new Donut(name, productCode)
  }

}
println("\nStep 3: How to create instances of the Donut class using the companion object")
val glazedDonut = Donut("Glazed Donut", 1111)
val vanillaDonut = Donut("Vanilla Donut", 2222)

println("\nStep 4: How to call function on each Donut object")
glazedDonut.print
vanillaDonut.print