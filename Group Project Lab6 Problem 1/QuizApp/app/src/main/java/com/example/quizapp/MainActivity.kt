package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.CheckBox
import android.widget.Toast
import com.example.quizapp.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*
import java.util.stream.Stream
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding;
    private var totalScore : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        submitButtonHandler()
        resetBtnHandler()
    }

    private fun resetBtnHandler(){
        binding.btnReset.setOnClickListener(){
            resetAll();
        }
    }

    private fun submitButtonHandler() {
        binding.btnSubmit.setOnClickListener {
            totalScore = 0
            checkFirstQuestion()
            addToScoreCheckBoxes()
            showScoreAndTime()
        }
    }

    private fun showScoreAndTime() {
        val currentDate = Date()
        val dateFormat =
            SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val dateString = dateFormat.format(currentDate)
        val message =
            "Congratulations! You submitted on ${dateString}, Your achieved ${totalScore}%"

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun checkFirstQuestion() {
        if (binding.radioGroup.checkedRadioButtonId == R.id.rb3) {
            totalScore += 50
        }

    }

    private fun retrieveCheckedBoxes(): List<CheckBox> {
        val public = binding.cbAnswer1
        val private = binding.cbAnswer3
        val protected = binding.cbAnswer4
        val packagePrivate = binding.cbAnswer2

        var arr = listOf(public,private,protected,packagePrivate)
        return arr.filter { it.isChecked }

    }

    private fun validateSecondQuestion() : Boolean{
        val checkItems = retrieveCheckedBoxes()

        if (checkItems.size != 3) return false

        if(checkItems.contains(binding.cbAnswer1) &&
            checkItems.contains(binding.cbAnswer3) && checkItems.contains(binding.cbAnswer4)) {
            return true
        }
        return false

    }

    private fun addToScoreCheckBoxes(){
        val answers = validateSecondQuestion();
        if(answers)
            totalScore += 50;
    }

    private fun resetCheckBoxes(){
        val checkBoxes = retrieveCheckedBoxes()

        checkBoxes.forEach{
            it.isChecked = false
        }
    }
    private fun resetRadioButton(){
        binding.radioGroup.clearCheck();
    }
    private fun resetAll(){
        resetRadioButton()
        resetCheckBoxes()
    }

}