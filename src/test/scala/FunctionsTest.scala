import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class FunctionsTest extends AnyFlatSpec {

  val obj = new Functions()

  //test cases for add
  "add Test1" should "return the sum of two numbers" in {
    obj.add(2, 3) shouldEqual (5)
  }
  "add Test2" should "return the sum of two numbers" in {
    obj.add(4, 3) shouldEqual (7)
  }
  "add Test3" should "return the sum of two numbers" in {
    obj.add(3, 3) shouldEqual (6)
  }

  //test cases for sum of list
  "sumoflist TestFirst" should "return the sum of List" in {
    obj.sumOfList(List(1, 2, 3, 4, 5)) shouldEqual (15)
  }
  "sumoflist TestSecond" should "return the sum of List" in {
    obj.sumOfList(List(2, 3, 4)) shouldEqual (9)
  }
  "sumoflist TestThird" should "return the sum of List" in {
    obj.sumOfList(List(4, 5)) shouldEqual (9)
  }

  //test cases for higherOrderFunction
  "higherOrderFunction test1" should "return the result" in {
    val sum = (num: Int) => num + 2
    obj.higherOrderFunction(sum, 2) shouldEqual (4)
  }
  "higherOrderFunction test2" should "return the result" in {
    val sum = (num: Int) => num + 2
    obj.higherOrderFunction(sum, 4) shouldEqual (6)
  }


}
