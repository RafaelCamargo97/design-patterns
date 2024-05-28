package Tax

import Item.Item

class StateTax:TaxesWithRate() {

    override fun isMinimumRate(item: Item): Boolean {
        return (!item.isImported && !item.isIndustrialized)
    }

    override fun getMinimumRate(item: Item): Double {
        return item.value * 0.01
    }

    override fun getMaximumRate(item: Item): Double {
        return item.value * 0.06
    }
}