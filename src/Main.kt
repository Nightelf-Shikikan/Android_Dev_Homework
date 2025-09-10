fun main() {
    val iphone4 = Electronics("iphone 4", 100.0, 15.0)
    val tshirt = Clothing("tshirt", 12.0, 33.0)
    val bread = Food("bread", 2.50, 0.0)
    val pcMouse = Electronics("PC Mouse", 11.0, 44.0)
    val ssdDisk = Electronics("SSD Disk", 113.0, 0.0)


    val products: List<finalPrice> = listOf(iphone4, tshirt, bread, pcMouse, ssdDisk)
    println("=== Shop Products ===")
    for (product in products) {
        product.displayInfo()
    }


    //  println("Shop products")
    //  iphone4.displayInfo()
    // tshirt.displayInfo()
    //  bread.displayInfo()
    //  pcMouse.displayInfo()
    //  ssdDisk.displayInfo()
}

