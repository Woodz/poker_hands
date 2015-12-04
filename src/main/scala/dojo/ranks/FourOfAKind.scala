package dojo.ranks

import dojo.CardValue.CardValue
import dojo.Outcome

case class FourOfAKind(number: CardValue) extends Rank(3) {
  def compareTo(other: Rank) = {
    other match {
      case FourOfAKind(otherNumber) => number.compare(otherNumber)
      case betterHand if betterHand.ordering < ordering => Outcome.Lost
      case _ => Outcome.Won
    }
  }
}