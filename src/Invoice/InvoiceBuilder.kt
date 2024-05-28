package Invoice

import Item.Item
import Discount.DiscountCalculator
import Log.Logger
import java.time.LocalDate

abstract class InvoiceBuilder() {
    var invoice: Invoice = Invoice()

    fun setInvoiceNumber(invoiceNumber: Int): InvoiceBuilder{
        invoice.invoiceNumber = invoiceNumber
        return this
    }

    fun setCompanyName(companyName: String): InvoiceBuilder {
        invoice.companyName = companyName
        return this
    }

    fun setIssueDate(): InvoiceBuilder{
        invoice.issueDate = LocalDate.now()
        return this
    }

    fun setItems(items: List<Item>): InvoiceBuilder{
        invoice.items = items
        return this
    }

    fun setObservations(obs: String): InvoiceBuilder{
        invoice.observations = obs
        return this
    }

    fun setDiscountValue(discount: DiscountCalculator, vipCLient: Boolean): InvoiceBuilder{
        invoice.discountValue = invoice.items?.let {
            discount.discountCalculate(nItems = it.size,
                purchaseValue = getItemsValue(), vipClient = vipCLient)
        }
        return this
    }

    fun getItemsValue():Double{
        return invoice.items?.sumOf { item -> item.value } ?: 0.0
    }

    fun buildInvoice(): Invoice{
        Logger.getInstance().addEvents(mapOf("Class: InvoiceBuilder" to "Function: buildInvoice"))
        setValue()
        return invoice
    }

    abstract fun setValue(): InvoiceBuilder

}