package Discount

import Log.Logger

class DiscountVip:Discounts() {
    override fun calculate(nItems: Int, purchaseValue: Double, vipClient: Boolean): Double {
        Logger.getInstance().addEvents(mapOf("Class: DiscountVip" to "Function: calculate"))
        if (vipClient) {
            return purchaseValue * 0.07
        }
        return nextFunction?.calculate(nItems, purchaseValue, vipClient) ?: 0.0
    }
}