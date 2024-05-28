package Invoice

import Log.Logger

class TaxExemptInvoice: InvoiceBuilder() {

    override fun setValue(): InvoiceBuilder {
        Logger.getInstance().addEvents(mapOf("Class: TaxExemptInvoice" to "Function: setValue"))
        invoice.value = getItemsValue() - (invoice.discountValue ?: 0.0)
        return this
    }

}