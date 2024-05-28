package Test

class Prototype: Test() {
    override fun example() {
        breakLine()
        println("Prototype pattern example")
        invoice3 = invoice2.clone()
        invoice3.companyName = "xpto"
        invoice3.observations = "This is a clone"
        println("--- Original ---")
        invoice2.printInvoice()
        println("--- Clone ---")
        invoice3.printInvoice()
    }
}