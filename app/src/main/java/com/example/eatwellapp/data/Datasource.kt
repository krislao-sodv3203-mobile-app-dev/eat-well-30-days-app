package com.example.eatwellapp.data

import com.example.eatwellapp.R
import com.example.eatwellapp.model.Recipe

// TODO: populate recipes 11 to 30
class Datasource {
    fun loadRecipes(): List<Recipe> {
        return listOf(
            Recipe(
                image = R.drawable.recipe1_image,
                title = R.string.recipe1_title,
                description = R.string.recipe1_description,
                externalLink = R.string.recipe1_link
            ),
            Recipe(
                image = R.drawable.recipe2_image,
                title = R.string.recipe2_title,
                description = R.string.recipe2_description,
                externalLink = R.string.recipe2_link
            ),
            Recipe(
                image = R.drawable.recipe3_image,
                title = R.string.recipe3_title,
                description = R.string.recipe3_description,
                externalLink = R.string.recipe3_link
            ),
            Recipe(
                image = R.drawable.recipe4_image,
                title = R.string.recipe4_title,
                description = R.string.recipe4_description,
                externalLink = R.string.recipe4_link
            ),
            Recipe(
                image = R.drawable.recipe5_image,
                title = R.string.recipe5_title,
                description = R.string.recipe5_description,
                externalLink = R.string.recipe5_link
            ),
            Recipe(
                image = R.drawable.recipe6_image,
                title = R.string.recipe6_title,
                description = R.string.recipe6_description,
                externalLink = R.string.recipe6_link
            ),
            Recipe(
                image = R.drawable.recipe7_image,
                title = R.string.recipe7_title,
                description = R.string.recipe7_description,
                externalLink = R.string.recipe7_link
            ),
            Recipe(
                image = R.drawable.recipe8_image,
                title = R.string.recipe8_title,
                description = R.string.recipe8_description,
                externalLink = R.string.recipe8_link
            ),
            Recipe(
                image = R.drawable.recipe9_image,
                title = R.string.recipe9_title,
                description = R.string.recipe9_description,
                externalLink = R.string.recipe9_link
            ),
            Recipe(
                image = R.drawable.recipe10_image,
                title = R.string.recipe10_title,
                description = R.string.recipe10_description,
                externalLink = R.string.recipe10_link
            )
        )
    }
}
