package nawrot.mateusz.timesup.domain.card


interface CardRepository {

    fun getCards(): List<Card>
}