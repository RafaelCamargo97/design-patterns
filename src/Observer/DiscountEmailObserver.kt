package Observer

import Item.Item

class DiscountEmailObserver: DiscountObserver {
    override fun updateDiscount(item: Item) {
        println("Sending e-mail informing about the discount")
    }
}