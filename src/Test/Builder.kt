package Test

import Tax.LocalTax

class Builder: Test() {
    override fun example() {
        breakLine()
        println("Builder pattern example")
        taxExemptInvoice
            .setCompanyName("Company Name")
            .setInvoiceNumber(123321121)
            .setIssueDate()
            .setObservations("Object created through a builder")
            .setItems(listOf(item1, item2))
            .setDiscountValue(discountCalculator, false)
        invoice1 = taxExemptInvoice.buildInvoice()
        invoice1.printInvoice()
        defaultInvoice
            .setCompanyName("Company Name2")
            .setIssueDate()
            .setItems(listOf(item1,item2,item3))
            .setDiscountValue(discountCalculator, true)
            .setInvoiceNumber(556620056)
        defaultInvoice.setTaxesValue(LocalTax())
        invoice2 = defaultInvoice.buildInvoice()
        invoice2.printInvoice()
    }
}