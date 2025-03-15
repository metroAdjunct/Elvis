fun main(args: Array<String>) {
    println("Show the Elvis Operator  ?:")
    println("First s is the String Hello ================" )
    var s: String? = "Hello"
    var out = s ?: "Nuthin"
    println("out = $out")
    println("Now s is the null String ================" )
    s = null
    out = s ?: "Nuthin"
    println("out = $out")
    println("================ ANOTHER TRY =======")
    var ss: String = ""
    var pout = (ss?:"Nuthin") + "Goodbye"
    println("pout = $pout")
}


/******************
 * DEFINITION OF ELVIS OPERATOR
var x = expr ?: alt
If expr is non null, x gets its value
if expr is null, x gets value alt
************/