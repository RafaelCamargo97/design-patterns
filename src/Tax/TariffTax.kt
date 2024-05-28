package Tax

import Item.Item

class TariffTax: Taxes {
    override fun calculate(item: Item): Double {
        return item.value * 0.05
    }
}