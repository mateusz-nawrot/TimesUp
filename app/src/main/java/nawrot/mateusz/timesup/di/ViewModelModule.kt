package nawrot.mateusz.timesup.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module


@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(westwingViewModelFactory: TimesUpViewModelFactory): ViewModelProvider.Factory

}