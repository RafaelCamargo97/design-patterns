package Invoice

import Log.Logger
import Tax.Taxes

class DefaultInvoice: InvoiceBuilder() {

    fun setTaxesValue(taxes: Taxes): InvoiceBuilder {
        Logger.getInstance().addEvents(mapOf("Class: DefaultInvoice" to "Function: setTaxesValue"))
        invoice.taxesValue = invoice.items?.sumOf { item -> taxes.calculate(item) } ?: 0.0
        return this
    }

    override fun setValue(): InvoiceBuilder {
        Logger.getInstance().addEvents(mapOf("Class: DefaultInvoice" to "Function: setValue"))
        invoice.value =
            getItemsValue() + (invoice.taxesValue ?: 0.0) - (invoice.discountValue ?: 0.0)
        return this
    }

}