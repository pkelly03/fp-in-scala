import com.fpinscala.exercises.List
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by paulkelly on 21/07/2014.
 */
class ListSpec extends FlatSpec with Matchers {
  "tail" should "remove the top element from the list" in {
    List.tail(List(1, 2, 3, 4, 5)) should be (List(2,3,4,5))
  }
}
