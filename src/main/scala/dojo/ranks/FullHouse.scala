package dojo.ranks

import dojo.CardValue.CardValue

case class FullHouse(pairValue: CardValue, tripleValue: CardValue) extends Rank(4) with Comparable[Rank] {
  def compareTo(o: Rank) = ???
}