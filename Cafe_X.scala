object Cafe_X {


def bill(shopping_list: List[String]): BigDecimal =  { // create a function that takes a shopping list as a string
  var total = BigDecimal(0)
  for (item <- shopping_list) { //iterate over shopping list and add up a total number for the items
    if (item == "coffee") total += 1
    else if (item == "steak_sandwich") total += 4.5
    else if (item == "cheese_sandwich") total += 2
    else if (item == "cola") total += 0.5
  }
  println("your total bill is £" + f"$total%1.2f") //print the total bill without service charge

  var service_charge = BigDecimal(0)
  if (!shopping_list.contains("steak_sandwich") && !shopping_list.contains("cheese_sandwich")) service_charge = BigDecimal(0) //if list contains only drinks then service charge is 0
  if (shopping_list.contains("steak_sandwich") || shopping_list.contains("cheese_sandwich")) service_charge = BigDecimal(0.1) //if list contains food the service charge is 10%
  if (shopping_list.contains("steak_sandwich")) service_charge = BigDecimal(0.2) // if list contains hot food the service charge is 20%

  var new_service_charge = (service_charge / total) * 100 //total service charge is worked out
  if (new_service_charge > 20) new_service_charge = 20  // if service charge is greater than 20 then the maximum is 20
  total += new_service_charge  // total service charge added to overall total

  println("your total service charge is £" + f"$new_service_charge%1.2f") //prints the total service charge
  println("your total amount is £" + f"$total%1.2f")  // prints the total overall amount
 total

}


}
