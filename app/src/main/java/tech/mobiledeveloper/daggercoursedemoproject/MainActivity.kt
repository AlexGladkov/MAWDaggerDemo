package tech.mobiledeveloper.daggercoursedemoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import tech.mobiledeveloper.daggercoursedemoproject.dagger.NetworkClient
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var networkClient: NetworkClient

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        networkClient.doSomething()
    }
}