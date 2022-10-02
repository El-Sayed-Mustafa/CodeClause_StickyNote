package com.plcoding.cleanarchitecturenoteapp.feature_note.domin.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
