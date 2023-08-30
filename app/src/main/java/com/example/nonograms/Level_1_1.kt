package com.example.nonograms

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class Level_1_1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private var cnt = 0
    private val win = 17

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level11)

        val b1 : TextView = findViewById(R.id.button1)
        var b1_on = false
        b1.setOnClickListener() {
            if (!b1_on) {
                b1.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b1_on = true
                ++cnt
            } else {
                b1.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b1_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }
        
        val b2 : TextView = findViewById(R.id.button2)
        var b2_on = false
        b2.setOnClickListener() {
            if (!b2_on) {
                b2.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b2_on = true
                ++cnt
            } else {
                b2.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b2_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }
        
        val b3 : TextView = findViewById(R.id.button3)
        var b3_on = false
        b3.setOnClickListener() {
            if (!b3_on) {
                b3.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b3_on = true
                ++cnt
            } else {
                b3.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b3_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }
        
        val b4 : TextView = findViewById(R.id.button4)
        var b4_on = false
        b4.setOnClickListener() {
            if (!b4_on) {
                b4.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b4_on = true
                ++cnt
            } else {
                b4.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b4_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }
        
        val b5 : TextView = findViewById(R.id.button5)
        var b5_on = false
        b5.setOnClickListener() {
            if (!b5_on) {
                b5.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b5_on = true
                ++cnt
            } else {
                b5.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b5_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }
        
        val b6 : TextView = findViewById(R.id.button6)
        var b6_on = false
        b6.setOnClickListener() {
            if (!b6_on) {
                b6.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b6_on = true
                ++cnt
            } else {
                b6.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b6_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }
        
        val b7 : TextView = findViewById(R.id.button7)
        var b7_on = false
        b7.setOnClickListener() {
            if (!b7_on) {
                b7.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b7_on = true
                --cnt
            } else {
                b7.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b7_on = false
                ++cnt
            }
            if (cnt == win) showWin()
        }
        
        val b8 : TextView = findViewById(R.id.button8)
        var b8_on = false
        b8.setOnClickListener() {
            if (!b8_on) {
                b8.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b8_on = true
                --cnt
            } else {
                b8.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b8_on = false
                ++cnt
            }
            if (cnt == win) showWin()
        }
        
        val b9 : TextView = findViewById(R.id.button9)
        var b9_on = false
        b9.setOnClickListener() {
            if (!b9_on) {
                b9.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b9_on = true
                --cnt
            } else {
                b9.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b9_on = false
                ++cnt
            }
            if (cnt == win) showWin()
        }
        
        val b10 : TextView = findViewById(R.id.button10)
        var b10_on = false
        b10.setOnClickListener() {
            if (!b10_on) {
                b10.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b10_on = true
                --cnt
            } else {
                b10.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b10_on = false
                ++cnt
            }
            if (cnt == win) showWin()
        }
        
        val b11 : TextView = findViewById(R.id.button11)
        var b11_on = false
        b11.setOnClickListener() {
            if (!b11_on) {
                b11.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b11_on = true
                ++cnt
            } else {
                b11.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b11_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }
        
        val b12 : TextView = findViewById(R.id.button12)
        var b12_on = false
        b12.setOnClickListener() {
            if (!b12_on) {
                b12.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b12_on = true
                ++cnt
            } else {
                b12.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b12_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b13 : TextView = findViewById(R.id.button13)
        var b13_on = false
        b13.setOnClickListener() {
            if (!b13_on) {
                b13.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b13_on = true
                ++cnt
            } else {
                b13.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b13_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b14 : TextView = findViewById(R.id.button14)
        var b14_on = false
        b14.setOnClickListener() {
            if (!b14_on) {
                b14.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b14_on = true
                ++cnt
            } else {
                b14.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b14_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b15 : TextView = findViewById(R.id.button15)
        var b15_on = false
        b15.setOnClickListener() {
            if (!b15_on) {
                b15.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b15_on = true
                ++cnt
            } else {
                b15.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b15_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b16 : TextView = findViewById(R.id.button16)
        var b16_on = false
        b16.setOnClickListener() {
            if (!b16_on) {
                b16.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b16_on = true
                --cnt
            } else {
                b16.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b16_on = false
                ++cnt
            }
            if (cnt == win) showWin()
        }
        
        val b17 : TextView = findViewById(R.id.button17)
        var b17_on = false
        b17.setOnClickListener() {
            if (!b17_on) {
                b17.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b17_on = true
                --cnt
            } else {
                b17.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b17_on = false
                ++cnt
            }
            if (cnt == win) showWin()
        }

        val b18 : TextView = findViewById(R.id.button18)
        var b18_on = false
        b18.setOnClickListener() {
            if (!b18_on) {
                b18.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b18_on = true
                --cnt
            } else {
                b18.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b18_on = false
                ++cnt
            }
            if (cnt == win) showWin()
        }

        val b19 : TextView = findViewById(R.id.button19)
        var b19_on = false
        b19.setOnClickListener() {
            if (!b19_on) {
                b19.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b19_on = true
                --cnt
            } else {
                b19.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b19_on = false
                ++cnt
            }
            if (cnt == win) showWin()
        }

        val b20 : TextView = findViewById(R.id.button20)
        var b20_on = false
        b20.setOnClickListener() {
            if (!b20_on) {
                b20.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b20_on = true
                ++cnt
            } else {
                b20.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b20_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b21 : TextView = findViewById(R.id.button21)
        var b21_on = false
        b21.setOnClickListener() {
            if (!b21_on) {
                b21.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b21_on = true
                ++cnt
            } else {
                b21.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b21_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b22 : TextView = findViewById(R.id.button22)
        var b22_on = false
        b22.setOnClickListener() {
            if (!b22_on) {
                b22.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b22_on = true
                ++cnt
            } else {
                b22.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b22_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b23 : TextView = findViewById(R.id.button23)
        var b23_on = false
        b23.setOnClickListener() {
            if (!b23_on) {
                b23.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b23_on = true
                ++cnt
            } else {
                b23.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b23_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b24 : TextView = findViewById(R.id.button24)
        var b24_on = false
        b24.setOnClickListener() {
            if (!b24_on) {
                b24.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b24_on = true
                ++cnt
            } else {
                b24.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b24_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }

        val b25 : TextView = findViewById(R.id.button25)
        var b25_on = false
        b25.setOnClickListener() {
            if (!b25_on) {
                b25.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                b25_on = true
                ++cnt
            } else {
                b25.setBackgroundColor(ContextCompat.getColor(this, R.color.button_light))
                b25_on = false
                --cnt
            }
            if (cnt == win) showWin()
        }
    }

    private fun showWin(){

        val builder = AlertDialog.Builder(this)

        with(builder)
        {
            setTitle("Уровень пройден!")
            setMessage("Вы прошли уровень Змейка! Поздравляем!")
            show()
        }

    }
}