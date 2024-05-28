package Discount

import Log.Logger

class DiscountItems:Discounts() {
    override fun calculate(nItems: Int, purchaseValue: Double, vipClient: Boolean): Double {
        Logger.getInstance().addEvents(mapOf("Class: DiscountItems" to "Function: calculate"))
        if (nItems>=10){
            return purchaseValue * 0.02
        }
        return nextFunction?.calculate(nItems, purchaseValue, vipClient) ?: 0.0
    }
}