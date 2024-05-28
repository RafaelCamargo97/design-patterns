package Invoice

import Item.Item
import java.time.LocalDate

class Invoice: Cloneable {
    var invoiceNumber: Int? = null
    var companyName: String? = null
    var issueDate: LocalDate? = null
    var items: List<Item>? = null
    var taxesValue: Double? = null
    var discountValue: Double? = null
    var observations: String? = null
    var value: Double? = null

    fun printInvoice(){
        println("Invoice Number: ${invoiceNumber}")
        println("Company Name: ${companyName}")
        println("Issue Date: ${issueDate}")
        println("Items: ${items}")
        println("Observations: ${observations}")
        println("Taxes Value: ${taxesValue}")
        println("Discount Value: ${discountValue}")
        println("Total Value: ${value}")
    }
    public override fun clone(): Invoice {
        return super.clone() as Invoice
    }
}