package dojo

import collection.immutable.Seq

case class Hand(player: String, cards: Seq[Card]) extends Comparable[Hand] {
  require(cards.length == 5, "A hand needs to contain 5 cards")
  require(player.nonEmpty, "A player name cannot be empty")

  def compareTo(other: Hand): Int = {
    ???
  }
}
