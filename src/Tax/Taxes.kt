package Tax

import Item.Item

interface Taxes {
    fun calculate(item: Item):Double
}