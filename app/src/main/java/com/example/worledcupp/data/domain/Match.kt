package com.example.worledcupp.data.domain

import java.lang.ref.PhantomReference

data class Match (
    val year:String,
    val staduim:String,
    val city:String,
    val homeTeamName:String,
    val awayTeamName:String,
    val homeTeamGoels:String,
    val awayTeamGoels:String,
)