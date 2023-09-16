package com.arfinrahmat.cryptoapp.domain

//Value Object
data class CryptoFeed(
    val coinInfo: CoinInfo
)

//Entity
data class CoinInfo(
    val id: String,
    val name: String,
    val fullName: String
)

//Value Object
data class Raw(
    val usd: USD
)

//Value Object
data class USD(
    val price: List<Double>,
    val changePctDay: Long
)


//Entity adalah data yang ada identifiernya