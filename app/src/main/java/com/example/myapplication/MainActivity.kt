package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception
import java.lang.Math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    private var squareNumber : EditText? = null
    private var number : EditText? = null
    private var constant : EditText? = null

    private var buttonSolutionEquation : Button? = null

    private var solutionEquation : TextView? = null
    //
    private var cathetFirst: EditText? = null
    private var cathetSecond: EditText? = null

    private var buttonRightTriangle : Button? = null

    private var hypotenuse : TextView? = null
    private var perimeter : TextView? = null
    private var square : TextView? = null
    //
    private var depositAmount: EditText? = null
    private var annualPercentage: EditText? = null

    private var buttonBank : Button? = null

    private var annualPercentageFiveYears : TextView? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        squareNumber = findViewById(R.id.squareNumber)
        number = findViewById(R.id.number)
        constant = findViewById(R.id.constant)

        buttonSolutionEquation = findViewById(R.id.buttonSolutionEquation)

        solutionEquation = findViewById(R.id.solutionEquation)

        buttonSolutionEquation?.setOnClickListener {
            if (squareNumber?.text?.toString()?.equals("")!! || number?.text?.toString()?.equals("")!! || constant?.text?.toString()?.equals("")!!)
                Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show()
            else {
                val squareNum: Double = squareNumber?.text.toString().toDouble()
                val num: Double = number?.text.toString().toDouble()
                val const: Double = constant?.text.toString().toDouble()

                if (squareNum == 0.0 && num == 0.0) {
                    solutionEquation?.text = "Решений нет"
                }else if (squareNum == 0.0) {
                    val x: Double = -const / num
                    solutionEquation?.text = "x₁ = x₂ = $x"
                    return@setOnClickListener
                }

                val discriminant: Double = squareNum * squareNum - 4 * num * const
                when {
                    discriminant < 0 -> solutionEquation?.text = "Решений нет"
                    discriminant == 0.0 -> {
                        val x: Double = -num / (2 * squareNum)
                        solutionEquation?.text = "x₁ = x₂ = $x"
                    }
                    else -> {
                        val x1: Double = (-num - kotlin.math.sqrt(discriminant)) / (2 * squareNum)
                        val x2: Double = (-num + kotlin.math.sqrt(discriminant)) / (2 * squareNum)
                        solutionEquation?.text = "x₁ = $x1\nx₂ = $x2"
                    }
                }
            }
        }

        cathetFirst = findViewById(R.id.cathet1)
        cathetSecond = findViewById(R.id.cathet2)

        buttonRightTriangle = findViewById(R.id.buttonRightTriangle)

        hypotenuse = findViewById(R.id.hypotenuse)
        perimeter = findViewById(R.id.perimeter)
        square = findViewById(R.id.square)

        buttonRightTriangle?.setOnClickListener {
            if (cathetFirst?.text?.toString()?.equals("")!! || cathetSecond?.text?.toString()?.equals("")!!)
                Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show()
            else {
                val cathet1: Double = cathetFirst?.text.toString().toDouble()
                val cathet2: Double = cathetSecond?.text.toString().toDouble()
                val hypotenuse: Double = sqrt(cathet1 * cathet1 + cathet2 * cathet2)

                this.hypotenuse?.text = "${hypotenuse}"
                perimeter?.text = "${cathet1 + cathet2 + hypotenuse}"
                square?.text = "${cathet1 * cathet2 / 2}"
            }
        }

        depositAmount = findViewById(R.id.depositAmount)
        annualPercentage = findViewById(R.id.annualPercentage)

        buttonBank = findViewById(R.id.buttonBank)

        annualPercentageFiveYears = findViewById(R.id.annualPercentageFiveYears)

        buttonBank?.setOnClickListener {
            if (depositAmount?.text?.toString()?.equals("")!! || annualPercentage?.text?.toString()?.equals("")!!)
                Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show()
            else {
                val depositAmount: Double = depositAmount?.text.toString().toDouble()
                val annualPercentage: Double = annualPercentage?.text.toString().toDouble()

                annualPercentageFiveYears?.text =
                    String.format("%.5f", depositAmount * pow(1.0 + (annualPercentage / 100), 5.0))
            }
        }
    }
}
