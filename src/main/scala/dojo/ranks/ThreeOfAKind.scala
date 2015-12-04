package dojo.ranks

import dojo.CardValue.CardValue

case class ThreeOfAKind(number: CardValue) extends Rank(7) with Comparable[Rank] {
  def compareTo(o: Rank) = ???
}