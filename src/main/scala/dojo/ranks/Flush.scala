package dojo.ranks

import dojo.CardValue.CardValue
import dojo.Suit.Suit

case class Flush(suit: Suit, highestNumber: CardValue) extends Rank(5) with Comparable[Rank] {
  def compareTo(o: Rank) = ???
}