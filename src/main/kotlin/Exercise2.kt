open class Product(name: String,quantity: Int){
    var p:Int=-1
    init {
        println("Product name :$name")
        println("Quantity: $quantity")

    }
    constructor(name: String,quantity: Int,p: Int) : this(name,quantity){
        this.p=p
        println("Price :$p per piece")
    }
}
class Laptop(name: String,quantity: Int,price : Int,cpu_n:String,RAM_s:String):Product(name,quantity,price){
    var hdd:String=""
    init{
        println("CPU name:$cpu_n")
        println("RAM_Size:$RAM_s")

    }
    constructor(name: String,quantity:Int,price: Int,cpu_n: String,RAM_s: String,hdd:String):this(name,quantity,price,cpu_n,RAM_s){
        this.hdd=hdd
        println("HDD_Size:$hdd")
        println("---------------")
    }

}

fun main(){
    var l1=Laptop("ACER",2,80000,"8Core","16GB","1024")
    var l2=Laptop("ASUS",5,70000,"8Core","32GB","512")
    var l3=Laptop("HP",4,41000,"8Core","16GB","512")
    var l4=Laptop("Lenovo",9,11000,"8Core","8GB","256")
    var l5=Laptop("DELL",6,45000,"8Core","16GB","256")
}