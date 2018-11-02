package nawrot.mateusz.timesup.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import nawrot.mateusz.timesup.TimesUpApp
import javax.inject.Singleton


@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilderModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: TimesUpApp): Builder

        fun build(): AppComponent

    }

    fun inject(app: TimesUpApp)

}