package Export

import Invoice.Invoice

class InvoiceExporter(val invoice: Invoice): Exportable {
    override fun export(): Map<String, String?> {
        return mapOf(
            "Invoice Number" to invoice.invoiceNumber.toString(),
            "Company Name" to invoice.companyName,
            "Observations" to invoice.observations,
            "Value" to invoice.value.toString()
        )
    }
}