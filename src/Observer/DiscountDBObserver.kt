package Observer

import Item.Item

class DiscountDBObserver: DiscountObserver{
    override fun updateDiscount(item: Item) {
        println("Registering discount on DB. Item.Item value with discount: ${item.value}")
    }
}