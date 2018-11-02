package nawrot.mateusz.timesup.app.home

import nawrot.mateusz.timesup.app.base.BaseViewModel
import nawrot.mateusz.timesup.domain.home.HomeViewState


class HomeViewModel : BaseViewModel<HomeViewState>() {
    override val defaultState: HomeViewState
        get() = HomeViewState(true, emptyList(), "")


}