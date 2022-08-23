class Car(com:String, year:Long, price:Int, owner:String, miles:Int,cprice:Int){
    var ty:String = com
    var yr =year
    var p:Int = price
    var ow = owner
    var m:Int = miles
    var cp:Int=cprice

    fun getCarPrice(){
        println("$" + (p-m).toString())
    }
    fun getCarInformation(){
        println("Car Information :$ty,$yr")
        println("Car Owner :$ow")
        println("Miles drive :$m")
        println("Original Car Price : $p")
        println("Current Car Price : $cp")
    }
}
fun main() {
    println("Creating class car object c1 in next line.")
    println("Object is created and Init is called")
    println("--------------")
    var c1=Car("Maserati",2020,4000,"Hell",1500,3500)
    c1.getCarInformation()

    println("Creating class car object c2 in next line.")
    println("Object is created and Init is called")
    println("--------------")
    var c2=Car("Aston Martin",2021,6000,"Heaven",2000,5200)
    c2.getCarInformation()


}