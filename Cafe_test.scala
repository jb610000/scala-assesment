import org.scalatest.FunSuite

class Cafe_test extends FunSuite {

  test("check that service charge should be zero when only drinks are purchased "){
    val test = Cafe_X.bill(List("coffee","cola"))
    assert(test === 2)
  }

  test("check that service charge is 10% when cold food are purchased"){
    val test = Cafe_X.bill(List("cheese_sandwich"))
    assert(test === 2)
  }
  test("check that service charge is 20% when hot food are purchased") {
    val test = Cafe_X.bill(List("steak_sandwich"))
    assert(test === 2)
  }

  test("check that duplicates can be added to the list") {
    val test = Cafe_X.bill(List("cola", "cola"))
    assert(test === 1)
  }

  test("if no items are added to the list the result should be 0"){
    val test = Cafe_X.bill(List("cola", "cola"))
    assert(test === 1)
  }

}
