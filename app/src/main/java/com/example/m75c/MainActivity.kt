package com.example.m75c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri

import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_twitter.setOnClickListener({
            val i=Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/yuuhanda"))
            startActivity(i)
        })

        button_github.setOnClickListener({
            val i=Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/Yuuhanda"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.soramin_bittersweetstep)

        button_play.setOnClickListener({
            MediaPlayer?.start()
        })

        button_pause.setOnClickListener({
            MediaPlayer?.pause()
        })

        button_stop.setOnClickListener({
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        })
    }
}
