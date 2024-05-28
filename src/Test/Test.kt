package Test

import Command.ItemManager
import Command.OnSaleDiscountCommand
import Discount.DiscountCalculator
import Export.InvoiceExporter
import Export.ItemExporter
import Invoice.DefaultInvoice
import Invoice.Invoice
import Invoice.TaxExemptInvoice
import Item.Item
import Observer.DiscountEmailObserver
import Tax.TaxCalculator

abstract class Test {
    companion object{
        var testItem = Item()
        var testItem2 = Item()
        val taxCalculator = TaxCalculator()
        val discountCalculator = DiscountCalculator()
        var saleDiscount = OnSaleDiscountCommand()
        var emailObserver = DiscountEmailObserver()
        val invoker = ItemManager()
        val invoker2 = ItemManager()
        val item1 = Item()
        val item2 = Item()
        val item3 = Item()
        var item4 = Item()
        val taxExemptInvoice = TaxExemptInvoice()
        val defaultInvoice = DefaultInvoice()
        lateinit var invoice1: Invoice
        var invoice2 = Invoice()
        lateinit var invoice3: Invoice
        lateinit var invoiceExporter: InvoiceExporter
        lateinit var itemExporter: ItemExporter

    }

    constructor(){
        testItem.value = 1000.0
        testItem2.value = 500.0
        item4.value = 100.0
        item1.value = 1000.0
        item1.isImported = false
        item1.isIndustrialized = false
        item2.value = 10.0
    }

    fun breakLine(){
        println("###############################")
    }
    abstract fun example()
}