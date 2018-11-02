package nawrot.mateusz.timesup.data

import nawrot.mateusz.timesup.domain.card.Card
import nawrot.mateusz.timesup.domain.card.CardRepository


class TuCardRepository : CardRepository {

    override fun getCards(): List<Card> {
        return listOf(
            Card(name = "Mateusz 1"),
            Card(name = "Mateusz 2"),
            Card(name = "Mateusz 3"),
            Card(name = "Mateusz 4"),
            Card(name = "Mateusz 5"),
            Card(name = "Mateusz 6"),
            Card(name = "Mateusz 7"),
            Card(name = "Mateusz 8"),
            Card(name = "Mateusz 9")
        )
    }

}