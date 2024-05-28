package Tax

import Item.Item

class TaxCalculator {
    fun calculate(item: Item, taxObj:Taxes):Double{
        return taxObj.calculate(item)
    }
}