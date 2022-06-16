package com.example.assesmentcalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnDivision:Button
    lateinit var btnModulus:Button
    lateinit var tilFirstnumber:TextInputLayout
    lateinit var etFirstnumber:EditText
    lateinit var tilSecondnumber:TextInputLayout
    lateinit var etSecondnumber:EditText
    lateinit var tvResult: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnDivision=findViewById(R.id.btnDivision)
        btnModulus=findViewById(R.id.btnModulus)
        tilFirstnumber=findViewById(R.id.tilSecondnumber)
        etFirstnumber=findViewById(R.id.etSecondnumber)
        tilSecondnumber=findViewById(R.id.tilFirstnumber)
        etSecondnumber=findViewById(R.id.etFirstnumber)
        tvResult=findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {
            var number1=etFirstnumber.text.toString().toDouble()
            var number2=etSecondnumber.text.toString().toDouble()
            addNums(number1,number2)

        }
        btnSubtract.setOnClickListener {
            var number1 = etFirstnumber.text.toString().toDouble()
            var number2 = etSecondnumber.text.toString().toDouble()
            subNums(number1,number2)
        }

        btnDivision.setOnClickListener {
            var number1 = etFirstnumber.text.toString().toDouble()
            var number2 = etSecondnumber.text.toString().toDouble()
            divNums(number1,number2)
        }
        btnModulus.setOnClickListener {
            var number1 = etFirstnumber.text.toString().toDouble()
            var number2 = etSecondnumber.text.toString().toDouble()
            moduleNums(number1,number2)
        }
    }


    fun addNums(num1:Double,num2:Double){
        var adds = num1+num2
        tvResult.text=adds.toString()
    }
    fun subNums(num1:Double,num2:Double){
        var subs = num1-num2
        tvResult.text=subs.toString()
    }
    fun divNums(num1:Double,num2:Double){
        var mods = num1%num2
        tvResult.text=mods.toString()
    }
    fun moduleNums(num1:Double,num2:Double){
        var mults= num1*num2
        tvResult.text=mults.toString()
    }

}

