package dojo.ranks

import dojo.CardValue.CardValue

case class HighCard(highCard: CardValue) extends Rank(10) with Comparable[Rank] {
  def compareTo(o: Rank) = ???
}