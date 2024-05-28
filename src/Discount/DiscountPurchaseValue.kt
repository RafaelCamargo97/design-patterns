package Discount

import Log.Logger

class DiscountPurchaseValue: Discounts() {

    override fun calculate(nItems: Int, purchaseValue: Double, vipClient: Boolean): Double {
        Logger.getInstance().addEvents(mapOf("Class: DiscountPurchaseValue" to "Function: calculate"))
        if (purchaseValue >= 1000.0) {
            return purchaseValue * 0.10
        }
        return nextFunction?.calculate(nItems, purchaseValue, vipClient) ?: 0.0
    }
}