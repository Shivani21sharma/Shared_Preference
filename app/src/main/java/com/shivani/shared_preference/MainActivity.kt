package com.shivani.shared_preference

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.content.ContextCompat
import com.shivani.shared_preference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var etItem: EditText
    var Int : Int=0
    lateinit var sharedPreferences: MainActivity
    lateinit var editor: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etEnterItem.setText("")
        binding.btnRed.setOnClickListener {
            binding.btnRed.setBackgroundColor(R.id.btnRed)

            binding.btnBlue.setOnClickListener {
                binding.btnBlue.setBackgroundColor(R.id.btnBlue)
            }
            binding.btnPink.setOnClickListener {
                binding.btnPink.setBackgroundColor(R.id.btnPink)
            }
            binding?.btnSave?.setOnClickListener {
                if (binding?.etEnterItem?.text?.toString()?.trim().isNullOrEmpty()){
                    binding?.etEnterItem?.error=MainActivity.resources.getString(R.id.etEnterItem,10)
                }else{
                    editor.putString("Item", binding?.etEnterItem?.text?.toString())
                    editor.commit()
                    editor.apply() }

                binding?.btnclear?.setOnClickListener {
                    if (binding?.etEnterItem?.text?.toString()?.trim().isNullOrEmpty()){
                        binding?.etEnterItem?.error=MainActivity.resources.getString(R.id.etEnterItem,10)
                    }else{
                        editor.putString("Item", binding?.etEnterItem?.text?.toString())
                        editor.commit()
                        editor.apply()

                    }
            }
        }
    }
}

