package nawrot.mateusz.timesup.domain.home

import nawrot.mateusz.timesup.domain.card.Card


data class HomeViewState(val isLoading: Boolean, val cards: List<Card>, val error: String)