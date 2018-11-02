package nawrot.mateusz.timesup.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import nawrot.mateusz.timesup.app.home.MainActivity
import nawrot.mateusz.timesup.app.home.MainActivityModule


@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class, FragmentBuilderModule::class])
    abstract fun mainActivity(): MainActivity

}
