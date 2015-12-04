package dojo.ranks

import dojo.CardValue.CardValue

case class OnePair(pair: CardValue) extends Rank(9) with Comparable[Rank] {
  def compareTo(o: Rank) = ???
}