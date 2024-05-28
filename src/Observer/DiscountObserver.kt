package Observer

import Item.Item

interface DiscountObserver {
    fun updateDiscount(item: Item)
}