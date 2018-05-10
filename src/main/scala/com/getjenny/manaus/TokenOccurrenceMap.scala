package com.getjenny.manaus

class TokenOccurrenceMap(occurrences_map: Map[String, Long]) extends TokenOccurrence {
  private[this] val tokensN: Long = occurrences_map.values.sum

  def tokenOccurrence(word: String): Long = {
    occurrences_map.getOrElse(word, 0)
  }

  def totalNumberOfTokens: Long = {
    tokensN
  }
}
