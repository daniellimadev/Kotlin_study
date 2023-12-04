package powerFunctions.typesOfFunctions

data class Item (val name: String, val price: Float) //Item has name and price
data class Order (val itens: Collection<Item>) //Order receives items, which is a collection of Item


//Extension function - Gets the value of the most expensive item of items. If it does not receive a value, it returns value 0F
fun Order.maxPricedItemValue(): Float = this.itens.maxByOrNull { it.price }?.price ?: 0F

//Extension function - Gets the name of the most expensive item of items. If it does not receive a value, it returns the value "NO_PRODUCTS"
fun Order.maxPricedItemName() = this.itens.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

//Extension property - Property that contains all the names of items concatenated and separated by commas in a String
val Order.commaDelimitedItemNames: String
    get() = itens.map { it.name }.joinToString()

fun main() {


    //Order instance, which is composed of the Item collection, which has name and price
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Name of the most expensive item: ${order.maxPricedItemName()}") //Prints -> Name of the most expensive item: Wine
    println("Value of the most expensive item: ${order.maxPricedItemValue()}") //Prints -> Value of the most expensive item: 29.0
    println("Items: ${order.commaDelimitedItemNames}") //Prints -> Items: Bread, Wine, Water

}