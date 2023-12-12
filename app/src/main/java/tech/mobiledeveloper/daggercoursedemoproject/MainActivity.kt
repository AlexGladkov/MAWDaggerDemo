package tech.mobiledeveloper.daggercoursedemoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import tech.mobiledeveloper.daggercoursedemoproject.dagger.FullRepository
import tech.mobiledeveloper.daggercoursedemoproject.dagger.NetworkClient
import tech.mobiledeveloper.daggercoursedemoproject.manual.ApplicationScope
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val appComponent = (application as MainApplication).appComponent
//        appComponent.activityComponent().create().inject(this)
//        setContentView(R.layout.activity_main)
//
//        fullRepository.makeRequest()

        val appScope = ApplicationScope()
        appScope.secondService.performAction()
    }
}