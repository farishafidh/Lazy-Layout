package com.example.lazylayoutmotivation.data

import com.example.lazylayoutmotivation.R
import com.example.lazylayoutmotivation.model.Motivation

class listMotivation() {
    fun loadMotivation(): List<Motivation>{
        return listOf<Motivation>(
            Motivation(R.drawable.image1, R.string.affirmation1),
            Motivation(R.drawable.image2, R.string.affirmation2),
            Motivation(R.drawable.image3, R.string.affirmation3),
            Motivation(R.drawable.image4, R.string.affirmation4),
            Motivation(R.drawable.image5, R.string.affirmation5),
            Motivation(R.drawable.image6, R.string.affirmation6),
            Motivation(R.drawable.image7, R.string.affirmation7),
            Motivation(R.drawable.image8, R.string.affirmation8),
            Motivation(R.drawable.image9, R.string.affirmation9),
            Motivation(R.drawable.image10, R.string.affirmation10)
        )
    }
}