package nawrot.mateusz.timesup.app.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


abstract class BaseViewModel<T> : ViewModel() {

    abstract val defaultState: T

    val viewState: MutableLiveData<T> by lazy { MutableLiveData<T>() }

    protected fun updateViewState(newState: T) {
        viewState.value = newState
    }
}