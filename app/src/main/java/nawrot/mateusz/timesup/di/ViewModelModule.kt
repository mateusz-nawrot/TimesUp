package nawrot.mateusz.timesup.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import nawrot.mateusz.timesup.app.home.HomeViewModel


@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(westwingViewModelFactory: TimesUpViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

}