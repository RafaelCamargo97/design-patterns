package Test

import Tax.TariffTax
import Tax.VatTax

class Strategy: Test() {

    override fun example(){
        breakLine()
        println("Strategy design pattern example")
        println(taxCalculator.calculate(testItem, VatTax()))
        println(taxCalculator.calculate(testItem, TariffTax()))
    }

}