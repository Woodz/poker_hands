package dojo.ranks

import dojo.Outcome
import dojo.Suit.Suit

case class RoyalFlush(suit: Suit) extends Rank(1) with Comparable[Rank] {
  def compareTo(other: Rank): Int = {
    other match {
      case RoyalFlush(_) => Outcome.Draw
      case _ => Outcome.Lost
    }
  }
}
