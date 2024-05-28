package Tax

import Item.Item

class VatTax: Taxes {
    override fun calculate(item: Item): Double {
        return item.value * 0.1
    }
}