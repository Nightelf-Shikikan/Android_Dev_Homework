class Clothing(
    val name: String,
    val price: Double,
    val discountPercent: Double
) : finalPrice {
    val finalPrice: Double
        get() = price - (price * discountPercent / 100)

    override fun getfinalPrice(): Double {
        return finalPrice
    }

    override fun displayInfo() {
        println("Clothing: $name  | Price: $${price}e | Discount: $discountPercent% | Final Price: $finalPrice")

    }
}