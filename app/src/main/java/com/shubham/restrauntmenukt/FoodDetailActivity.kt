package com.shubham.restrauntmenukt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_food_details.*
import kotlinx.android.synthetic.main.food_menu_child.iv_food_image
import kotlinx.android.synthetic.main.food_menu_child.tv_food_name

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        handleintent()
    }

    private fun handleintent() {
        val bundle = intent.extras
        setDataToViews(bundle)
    }

    private fun setDataToViews(bundle: Bundle?) {
        bundle?.getInt("image")?.let { iv_food_image.setImageResource(it) }
        tv_food_name.text = bundle?.getString("name")
        tv_food_description.text = bundle?.getString("des")
    }
}