package Discount

abstract class Discounts() {

    var nextFunction: Discounts? = null
    abstract fun calculate(nItems:Int, purchaseValue:Double, vipClient:Boolean):Double
}