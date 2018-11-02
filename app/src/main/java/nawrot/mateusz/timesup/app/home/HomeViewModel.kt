package nawrot.mateusz.timesup.app.home

import nawrot.mateusz.timesup.app.base.BaseViewModel
import nawrot.mateusz.timesup.domain.home.HomeViewState
import javax.inject.Inject


class HomeViewModel @Inject constructor() : BaseViewModel<HomeViewState>() {

    override val defaultState: HomeViewState = HomeViewState(true, emptyList(), "")


}