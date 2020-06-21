package com.taruna.chatajacodingtest.ui.timer

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.taruna.chatajacodingtest.R
import kotlinx.android.synthetic.main.fragment_timer.*
import java.util.concurrent.TimeUnit

class TimerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_timer, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        object : CountDownTimer(10L, TimeUnit.SECONDS) {
            override fun onTick(tickValue: Long) {
                textTimer.text = "Remaining: $tickValue"
            }

            override fun onFinish() {
                textTimer.text = "The End!"
            }
        }.start()
    }

    companion object {
        fun newInstance() = TimerFragment()
    }
}