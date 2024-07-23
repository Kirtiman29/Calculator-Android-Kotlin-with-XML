package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder as ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.AC.setOnClickListener {
            binding.inputTextView.text=""
            binding.resultTextView2.text=""
        }

        binding.one.setOnClickListener {
          binding.inputTextView.append("1")

        }
        binding.two.setOnClickListener {
            binding.inputTextView.append("2")
        }
        binding.three.setOnClickListener {
            binding.inputTextView.append("3")
        }
        binding.four.setOnClickListener {
            binding.inputTextView.append("4")
        }
        binding.five.setOnClickListener {
            binding.inputTextView.append("5")
        }
        binding.six.setOnClickListener {
            binding.inputTextView.append("6")
        }
        binding.seven.setOnClickListener {
            binding.inputTextView.append("7")
        }
        binding.eight.setOnClickListener {
            binding.inputTextView.append("8")
        }
        binding.nine.setOnClickListener {
            binding.inputTextView.append("9")
        }
        binding.zero.setOnClickListener {
            binding.inputTextView.append("0")
        }
        binding.plus.setOnClickListener {
            binding.inputTextView.append("+")
        }
        binding.minus.setOnClickListener {
            binding.inputTextView.append("-")
        }
        binding.multiply.setOnClickListener {
            binding.inputTextView.append("*")
        }
        binding.divide.setOnClickListener {
            binding.inputTextView.append("/")
        }
        binding.decimal.setOnClickListener {
            binding.inputTextView.append(".")
        }
        binding.openBracket.setOnClickListener {
            binding.inputTextView.append("(")
        }
        binding.closeBrcket.setOnClickListener {
            binding.inputTextView.append(")")
        }
        binding.equalto.setOnClickListener {
            val expression= ExpressionBuilder(binding.inputTextView.text.toString()).build()
            val result=expression.evaluate()
            val longResult=result.toLong()

            if (result == longResult.toDouble()){
                binding.resultTextView2.text=longResult.toString()
            }else{
                binding.resultTextView2.text=result.toString()
            }
        }
    }
}