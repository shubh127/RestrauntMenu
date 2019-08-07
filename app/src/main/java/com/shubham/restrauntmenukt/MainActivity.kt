package com.shubham.restrauntmenukt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listOfFoods = mutableListOf<Food>()
    var adapter: FoodAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateFoodList()

        adapter = FoodAdapter(context = this, listOfFoods = listOfFoods)
        gv_food_list.adapter=adapter
    }

    private fun populateFoodList() {
        listOfFoods.add(Food(getString(R.string.coffee), getString(R.string.coffee_description), R.drawable.coffee_pot))
        listOfFoods.add(
            Food(
                getString(R.string.espresso),
                getString(R.string.espresso_description),
                R.drawable.espresso
            )
        )
        listOfFoods.add(
            Food(
                getString(R.string.french_fries),
                getString(R.string.french_fries_description),
                R.drawable.french_fries
            )
        )
        listOfFoods.add(Food(getString(R.string.honey), getString(R.string.honey_description), R.drawable.honey))
        listOfFoods.add(
            Food(
                getString(R.string.strawberry_ice_cream),
                getString(R.string.strawberry_ice_cream_description),
                R.drawable.strawberry_ice_cream
            )
        )
        listOfFoods.add(
            Food(
                getString(R.string.sugar_cubes),
                getString(R.string.sugar_cubes_description),
                R.drawable.sugar_cubes
            )
        )
    }
}
