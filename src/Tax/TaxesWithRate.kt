package Tax

import Item.Item

abstract class TaxesWithRate:Taxes {
    override fun calculate(item: Item):Double{
        if(isMinimumRate(item)) {
            return getMinimumRate(item)
        }
        return getMaximumRate(item)
    }

    abstract fun isMinimumRate(item: Item):Boolean
    abstract fun getMinimumRate(item: Item):Double
    abstract fun getMaximumRate(item: Item): Double
}