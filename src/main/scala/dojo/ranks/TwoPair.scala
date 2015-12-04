package dojo.ranks

import dojo.CardValue.CardValue

case class TwoPair(firstPair: CardValue, secondPair: CardValue) extends Rank(8) with Comparable[Rank] {
  def compareTo(o: Rank) = ???
}