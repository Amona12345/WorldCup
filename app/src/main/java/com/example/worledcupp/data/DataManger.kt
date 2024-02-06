package com.example.worledcupp.data

import com.example.worledcupp.data.domain.Match

object DataManger {
    val matchList = mutableListOf<Match>()
    private var matchIndex=0
    fun addMatch(match:Match){
        matchList.add(match)
    }

    fun getCurrntMatch():Match= matchList[matchIndex]

    fun getNextMatch():Match{
        matchIndex++
        if( matchIndex== matchList.size){
            matchIndex=0
        }
        return matchList[matchIndex]
    }
    fun getPeriviousMatch():Match{
        matchIndex--
        if(matchIndex==-1){
            matchIndex= matchList.size-1
        }
        return matchList[matchIndex]
    }
}