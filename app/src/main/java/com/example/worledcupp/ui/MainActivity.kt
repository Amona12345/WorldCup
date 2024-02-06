package com.example.worledcupp.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.core.content.PackageManagerCompat.LOG_TAG
import com.example.worledcupp.R
import com.example.worledcupp.data.DataManger
import com.example.worledcupp.data.domain.Match
import com.example.worledcupp.databinding.ActivityMainBinding
import com.example.worledcupp.utill.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader
class MainActivity :BaseActivity<ActivityMainBinding>(){
    override val LOG_TAG: String
            ="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =ActivityMainBinding::inflate

    override fun setUp() {
        parseFile()
    }

    @SuppressLint("SuspiciousIndentation")
    override fun addCallback() {
binding?.apply {
 image1.setOnClickListener {
   val match=  DataManger.getPeriviousMatch()
     bindMatch(match)
 }
    image2.setOnClickListener {
      bindMatch( DataManger.getNextMatch())
    }
}
    }
    fun parseFile() {
        val inputStream = assets.open("worldcup.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser =CsvParser()
        buffer.forEachLine {

            val currentMatch=parser.parse(it)
         DataManger.addMatch(currentMatch)
        }
        bindMatch(DataManger.getCurrntMatch())
    }
private fun bindMatch(match: Match){
    binding?.apply {
        yaer.text=match.year
        textStudim.text=match.staduim
        back.text=match.homeTeamName
        next.text=match.awayTeamName
        fristnum.text=match.homeTeamGoels
        seconednum.text=match.awayTeamGoels

    }
}
}