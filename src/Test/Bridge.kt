package Test

import Export.InvoiceExporter
import Export.ItemExporter
import Export.JsonExport
import Export.XmlExport

class Bridge: Test() {
    override fun example() {
        breakLine()
        println("Bridge pattern example")
        invoiceExporter = InvoiceExporter(invoice2)
        println(XmlExport().formatExport(invoiceExporter))
        println(JsonExport().formatExport(invoiceExporter))

        itemExporter = ItemExporter(item1)
        println(XmlExport().formatExport(itemExporter))
        println(JsonExport().formatExport(itemExporter))
    }
}