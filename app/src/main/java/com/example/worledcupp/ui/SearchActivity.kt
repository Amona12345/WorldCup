package com.example.worledcupp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.worledcupp.R
import com.example.worledcupp.databinding.ActivitySearchBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class SearchActivity : BaseActivity<ActivitySearchBinding>() {
    override val LOG_TAG: String
    ="SEARCH_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivitySearchBinding =ActivitySearchBinding::inflate

    override fun setUp() {

    }

    override fun addCallback() {
    }


}