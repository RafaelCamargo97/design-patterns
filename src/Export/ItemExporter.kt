package Export

import Item.Item

class ItemExporter(val item: Item): Exportable {
    override fun export(): Map<String, String?> {
        return mapOf(
            "Item.Item Value" to item.value.toString(),
            "Discount Applied" to item.onSaleDiscountApplied.toString()
        )
    }
}