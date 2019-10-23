object Cafe_X {


def bill(shopping_list: List[String]): BigDecimal =  {
  var total = BigDecimal(0)
  for (item <- shopping_list) {
    if (item == "coffee") total += 1
    else if (item == "steak_sandwich") total += 4.5
    else if (item == "cheese_sandwich") total += 2
    else if (item == "cola") total += 0.5
  }
  println("your total bill is £" + f"$total%1.2f")

  var service_charge = BigDecimal(0)
  if (!shopping_list.contains("steak_sandwich") && !shopping_list.contains("cheese_sandwich")) service_charge = BigDecimal(0)
  if (shopping_list.contains("steak_sandwich") || shopping_list.contains("cheese_sandwich")) service_charge = BigDecimal(0.1)
  if (shopping_list.contains("steak_sandwich")) service_charge = BigDecimal(0.2)

  var new_service_charge = (service_charge / total) * 100
  if (new_service_charge > 20) new_service_charge = 20
  total += new_service_charge

  println("your total service charge is £" + f"$new_service_charge%1.2f")
  println("your total amount is £" + f"$total%1.2f")
 total

}


}
