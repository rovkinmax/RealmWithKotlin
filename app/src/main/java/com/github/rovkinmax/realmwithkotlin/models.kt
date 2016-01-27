package com.github.rovkinmax.realmwithkotlin

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * @author Rovkin Max
 */
@RealmClass
public open class Ad : RealmObject() {
    @PrimaryKey
    public open var id: Long = 0
    public open var name: String = ""
    public open var phoneNumber: String = ""
    public open var cityName: String = ""
    public open var place: String = ""
    public open var condition: String = ""
    public open var date: String = ""
}

@RealmClass
public open class User : RealmObject() {
    @PrimaryKey
    public open var id: String = ""
    public open var name: String = ""
    public open var phone: String = ""
}