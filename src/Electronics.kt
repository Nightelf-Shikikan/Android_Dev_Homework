open class Electronics(
    val name: String,
    val price: Double,
    val discountPercent: Double
): finalPrice{
    val finalPrice: Double
        get() = price -(price * discountPercent / 100)

    override fun getfinalPrice(): Double {
        return finalPrice
    }
    override fun displayInfo(){
        println("Electronics: $name  | Price: $${price} | Discount: $discountPercent% | Final Price: $finalPrice")

    }
}

