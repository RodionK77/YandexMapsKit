package com.example.yandexmaps

import android.app.AlertDialog
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var city = intent.getStringExtra("city")

        val btn1 = findViewById<Button>(R.id.b_1)
        val btn2 = findViewById<Button>(R.id.b_2)
        val btn3 = findViewById<Button>(R.id.b_3)
        val btn4 = findViewById<Button>(R.id.b_4)
        val image = findViewById<ImageView>(R.id.image_view)
        val text = findViewById<TextView>(R.id.text_view)

        when (city){
            "Moscow" -> {
                toolbar.title = "Москва"
                image.setImageResource(R.drawable.img_moscow)
                text.text = "Какая из достопримечательностей находится НЕ в Москве?"
            }
            "Sydney" -> {
                toolbar.title = "Сидней"
                image.setImageResource(R.drawable.img_sydney)
                text.text = "Какая из достопримечательностей находится НЕ в Сиднее?"
            }
            "Paris" -> {
                toolbar.title = "Париж"
                image.setImageResource(R.drawable.img_paris)
                text.text = "Какая из достопримечательностей находится НЕ в Париже?"
            }
            "Montreal" -> {
                toolbar.title = "Монреаль"
                image.setImageResource(R.drawable.img_montreal)
                text.text = "Какая из достопримечательностей находится НЕ в Монреале?"
            }
        }

        btn1.setOnClickListener {
            when (city){
                "Moscow" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это киностудия 'МОСФИЛЬМ'.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Sydney" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Верно!")
                        .setMessage("Это самое высокое здание Африки, расположенное в Йоханнесбурге.")
                        .setIcon(R.drawable.ic_baseline_yes)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Paris" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это Триумфальная арка.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Montreal" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это монреальская биосфера.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
            }
        }
        btn2.setOnClickListener {
            when (city){
                "Moscow" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это патриаршие пруды.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Sydney" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это королевские ботанические сады.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Paris" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Верно!")
                        .setMessage("Это диснейленд в Лос-Анджелесе.")
                        .setIcon(R.drawable.ic_baseline_yes)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Montreal" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Верно!")
                        .setMessage("Это дворец земледельцев в Казани.")
                        .setIcon(R.drawable.ic_baseline_yes)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
            }
        }
        btn3.setOnClickListener {
            when (city){
                "Moscow" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Верно!")
                        .setMessage("Это Успенский собор в Хельсинках.")
                        .setIcon(R.drawable.ic_baseline_yes)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Sydney" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это сиднейская башня.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Paris" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это мост Александр III.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Montreal" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это собор Монреальской Богоматери.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
            }
        }
        btn4.setOnClickListener {
            when (city){
                "Moscow" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это Красная площадь.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Sydney" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это сиднейский оперный театр.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Paris" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это Лувр.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
                "Montreal" -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Не верно!")
                        .setMessage("Это дом 'Хабитат 67'.")
                        .setIcon(R.drawable.ic_baseline_no)
                        .setPositiveButton("Продолжить") {
                                dialog, id ->  dialog.cancel()
                        }
                    builder.create().show()
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId === android.R.id.home) {
            finish()
        }
        return true
    }
}