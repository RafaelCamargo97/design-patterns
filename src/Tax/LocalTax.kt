package Tax

import Item.Item

class LocalTax:TaxesWithRate() {

    override fun isMinimumRate(item: Item): Boolean {
        return ((!item.isImported && !item.isIndustrialized) || (!item.isImported && item.value <= 100.0))
    }

    override fun getMinimumRate(item: Item): Double {
        return item.value * 0.01
    }

    override fun getMaximumRate(item: Item): Double {
        return item.value * 0.04
    }

}