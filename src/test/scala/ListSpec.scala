import com.fpinscala.exercises.datastructures.List
import org.scalatest.{Matchers, FlatSpec}

class ListSpec extends FlatSpec with Matchers {
  "tail" should "remove the top element from the list" in {
    List.tail(List(4, 2, 3, 4, 5)) should be (List(2,3,4,5))
  }

  "setHead" should "set the head of the list to a new element" in {
    List.setHead(List(1,2,3,4), 5) should be (List(5,2,3,4))
  }

  "drop" should "drop the first n elements from a list" in {
    List.drop(List(1,2,3,4,5),3) should be (List(4,5))
  }
}
