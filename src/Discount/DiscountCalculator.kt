package Discount

class DiscountCalculator {
    fun discountCalculate(nItems: Int, purchaseValue: Double, vipClient: Boolean): Double {
        val handlersList = listOf(DiscountPurchaseValue(), DiscountVip(), DiscountItems())

        for (handler in handlersList){
            handler.nextFunction = handlersList.elementAtOrNull(handlersList.indexOf(handler)+1)
        }

        return handlersList.first().calculate(nItems, purchaseValue, vipClient)
    }
}