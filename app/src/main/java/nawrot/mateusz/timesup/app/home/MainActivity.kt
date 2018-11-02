package nawrot.mateusz.timesup.app.home

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import dagger.android.AndroidInjection
import nawrot.mateusz.timesup.R
import nawrot.mateusz.timesup.app.base.createViewModel
import javax.inject.Inject

class MainActivity : FragmentActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homeViewModel = createViewModel(viewModelFactory)
    }
}
