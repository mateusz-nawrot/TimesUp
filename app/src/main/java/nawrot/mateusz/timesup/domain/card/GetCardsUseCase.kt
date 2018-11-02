package nawrot.mateusz.timesup.domain.card

import nawrot.mateusz.timesup.domain.base.UseCase
import javax.inject.Inject


class GetCardsUseCase @Inject constructor(private val cardRepository: CardRepository) : UseCase<Unit, List<Card>>() {

    override fun execute(param: Unit): List<Card> {
        return cardRepository.getCards()
    }

}