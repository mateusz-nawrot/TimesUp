package nawrot.mateusz.timesup.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import nawrot.mateusz.timesup.TimesUpApp
import nawrot.mateusz.timesup.data.TuCardRepository
import nawrot.mateusz.timesup.domain.card.CardRepository


@Module(includes = [(ViewModelModule::class)])
abstract class AppModule {

    @Binds
    abstract fun bindApplication(app: TimesUpApp): Application

    @Binds
    abstract fun bindContext(app: TimesUpApp): Context

    @Binds
    abstract fun bindCardRepository(cardRepository: TuCardRepository): CardRepository

}