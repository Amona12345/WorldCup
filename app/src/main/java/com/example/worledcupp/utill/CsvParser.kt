package com.example.worledcupp.utill

import com.example.worledcupp.data.domain.Match

class CsvParser {
    fun parse(line:String):Match{
        val tokens =line.split(",")
        return Match(
            year = tokens[Constant.ColumnIndex.YEAR],
            staduim = tokens[Constant.ColumnIndex.STADIUM],
            city = tokens[Constant.ColumnIndex.CITY],
            homeTeamName = tokens[Constant.ColumnIndex.HOME_TEAM_NAME],
            awayTeamName  = tokens[Constant.ColumnIndex.AWAY_TEAM_NAME],
            homeTeamGoels = tokens[Constant.ColumnIndex.HOME_TEAM_GOALS],
            awayTeamGoels = tokens[Constant.ColumnIndex.AWAY_TEAM_GOALS])
    }
}