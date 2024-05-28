package Command

import Item.Item
import Observer.DiscountObserver

class OnSaleDiscountCommand: ItemCommand {
    var observers = mutableSetOf<DiscountObserver>()

    override fun execute(item: Item) {
        if (!item.onSaleDiscountApplied){
            item.value *= 0.95
            item.onSaleDiscountApplied = true
            notifyObservers(item)
        }
    }

    override fun unexecute(item: Item) {
        if (item.onSaleDiscountApplied){
            item.value /= 0.95
            item.onSaleDiscountApplied = false
            notifyObservers(item)
        }
    }

    fun attachObserver(observer: DiscountObserver) {
        observers.add(observer)
    }

    fun detachObserver(observer: DiscountObserver) {
        observers.remove(observer)
    }

    fun notifyObservers(item: Item) {
        for (observer in observers) {
            observer.updateDiscount(item)
        }
    }
}