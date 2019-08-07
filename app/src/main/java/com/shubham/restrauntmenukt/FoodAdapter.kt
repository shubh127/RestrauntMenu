package com.shubham.restrauntmenukt

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.food_menu_child.view.*

class FoodAdapter : BaseAdapter {

    var listOfFoods = mutableListOf<Food>()
    var context: Context? = null

    constructor(listOfFoods: MutableList<Food>, context: Context) : super() {
        this.listOfFoods = listOfFoods
        this.context = context
    }

    override fun getView(index: Int, view: View?, viewGroup: ViewGroup?): View {
        val food = listOfFoods[index]
        val inflator = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val foodView = inflator.inflate(R.layout.food_menu_child, null)

        food.foodImage?.let { foodView.iv_food_image.setImageResource(it) }
        foodView.tv_food_name.text = food.foodName

        foodView.setOnClickListener {
            val intent = Intent(context, FoodDetailsActivity::class.java)
            intent.putExtra("name", food.foodName)
            intent.putExtra("des", food.foodDescription)
            intent.putExtra("image", food.foodImage)
            context?.startActivity(intent)
        }

        return foodView
    }

    override fun getItem(index: Int): Any {
        return index
    }

    override fun getItemId(id: Int): Long {
        return id.toLong()
    }

    override fun getCount(): Int {
        return listOfFoods.size
    }
}