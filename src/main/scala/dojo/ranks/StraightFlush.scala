package dojo.ranks

import dojo.CardValue.CardValue
import dojo.Outcome
import dojo.Suit.Suit

case class StraightFlush(suit: Suit, highest: CardValue) extends Rank(2) with Comparable[Rank] {
  def compareTo(other: Rank) = {
    other match {
      case StraightFlush(_, otherHighest) => highest.compare(otherHighest)
      case betterHand if betterHand.ordering < ordering => Outcome.Lost
      case _ => Outcome.Won
    }
  }
}