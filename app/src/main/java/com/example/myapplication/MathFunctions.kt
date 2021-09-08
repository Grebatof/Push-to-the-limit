package com.example.myapplication

import kotlin.math.pow
import kotlin.math.sqrt

fun solveQuadraticEquation(squareVariable: Double, variable: Double, constant: Double): MutableList<Double> {
    val answers: MutableList<Double> = mutableListOf()

    if (squareVariable == 0.0 && variable == 0.0) {
        return answers
    }else if (squareVariable == 0.0) {
        answers.add(-constant / variable)
        return answers
    }

    val discriminant: Double = variable.pow(2) - 4 * squareVariable * constant
    when {
        //discriminant < 0 -> return answers
        discriminant == 0.0 -> {
            answers.add(-variable / (2 * squareVariable))
        }
        discriminant > 0 -> {
            answers.add((-variable - sqrt(discriminant)) / (2 * squareVariable))
            answers.add((-variable + sqrt(discriminant)) / (2 * squareVariable))
        }
    }

    return answers
}

fun findHypotenuse(cathetFirst: Double, cathetSecond: Double): Double? {
    if (cathetFirst <= 0 || cathetSecond <= 0)
        return null
    return sqrt(cathetFirst * cathetFirst + cathetSecond * cathetSecond)
}

fun findAreaRightTriangle(cathetFirst: Double, cathetSecond: Double): Double? {
    if (cathetFirst <= 0 || cathetSecond <= 0)
        return null
    return cathetFirst * cathetSecond / 2
}

fun findPerimeterRightTriangle(cathetFirst: Double, cathetSecond: Double): Double? {
    if (cathetFirst <= 0 || cathetSecond <= 0)
        return null
    return cathetFirst + cathetSecond + findHypotenuse(cathetFirst, cathetSecond)!!
}

fun Double.findDepositAmountFiveYears(annualPercentage: Double): Double? {
    if (this <= 0 || annualPercentage <= 0)
        return null
    return this * (1.0 + (annualPercentage / 100)).pow(5.0)
}

fun parity(x: Int): Boolean = x % 2 == 0

fun divisibilityByThree(x: Int): Boolean = x % 3 == 0