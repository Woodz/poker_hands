import org.scalatest._
import dojo._
import collection.immutable.Seq

class HandSpec extends WordSpec with Matchers {
  "Hand" should {
    "throw IllegalArgumentException" when {
      "player name is empty" in {
        an[IllegalArgumentException] shouldBe thrownBy {
          new Hand(
            "", Seq(
              Card(Suit.Club, CardValue.Two),
              Card(Suit.Club, CardValue.Three),
              Card(Suit.Club, CardValue.Four),
              Card(Suit.Club, CardValue.Five),
              Card(Suit.Club, CardValue.Six)))
        }
      }

      "card count < 5" in {
        an[IllegalArgumentException] shouldBe thrownBy {
          new Hand("foo", Seq(
            Card(Suit.Club, CardValue.Two),
            Card(Suit.Club, CardValue.Three),
            Card(Suit.Club, CardValue.Four),
            Card(Suit.Club, CardValue.Five)))
        }
      }

      "card count > 5" in {
        an[IllegalArgumentException] shouldBe thrownBy {
          new Hand("foo", Seq(
            Card(Suit.Club, CardValue.Two),
            Card(Suit.Club, CardValue.Three),
            Card(Suit.Club, CardValue.Four),
            Card(Suit.Club, CardValue.Five),
            Card(Suit.Club, CardValue.Six),
            Card(Suit.Club, CardValue.Seven)))
        }
      }
    }

    "create a valid hand" when {
      "given a name and 5 unique cards" in {
        new Hand(
          "foo", Seq(
            Card(Suit.Club, CardValue.Two),
            Card(Suit.Club, CardValue.Three),
            Card(Suit.Club, CardValue.Four),
            Card(Suit.Club, CardValue.Five),
            Card(Suit.Club, CardValue.Six)))
      }
    }
  }
}
