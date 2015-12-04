package dojo.ranks

import dojo.CardValue.CardValue
import dojo.Suit.Suit

case class Straight(highestNumber: CardValue) extends Rank(6) with Comparable[Rank] {
  def compareTo(o: Rank) = ???
}