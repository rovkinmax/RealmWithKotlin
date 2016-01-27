package com.github.rovkinmax.realmwithkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.realm.Realm

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ad = Ad()
        ad.id = 988
        ad.cityName = "ekb"
        ad.condition = "bla bla"
        ad.date = "24.07.1909"
        ad.place = "Zemlya"

        val user = User()
        user.id = "1234"
        user.name = "Pupka"
        user.phone = "none"
        val realm = Realm.getInstance(this)
        realm.executeTransaction {
            it.copyToRealmOrUpdate(ad)
            it.copyToRealmOrUpdate(user)
        }

        val adList = realm.allObjects(Ad::class.java)
        assert(adList.isNotEmpty())
        assert(realm.allObjects(User::class.java).isNotEmpty())
    }
}
