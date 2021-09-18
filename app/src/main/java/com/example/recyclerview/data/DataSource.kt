package com.example.recyclerview.data

import com.example.recyclerview.R
import com.example.recyclerview.model.Motivation

class DataSource {
    fun loadMotivations() : List <Motivation> {
        return listOf <Motivation> (
            Motivation(R.string.motivate1, R.drawable.strong),
            Motivation(R.string.motivate2, R.drawable.believe),
            Motivation(R.string.motivate3, R.drawable.success),
            Motivation(R.string.motivate4, R.drawable.grateful),
            Motivation(R.string.motivate5, R.drawable.opportunity),
            Motivation(R.string.motivate6, R.drawable.goodlife),
            Motivation(R.string.motivate7, R.drawable.success1),
            Motivation(R.string.motivate8, R.drawable.success2),
            Motivation(R.string.motivate9, R.drawable.gratitude),
            Motivation(R.string.motivate10, R.drawable.goldenlife),
            Motivation(R.string.motivate11, R.drawable.creator),
            Motivation(R.string.motivate12, R.drawable.family),
            Motivation(R.string.motivate13, R.drawable.goals),
            Motivation(R.string.motivate14, R.drawable.target),
            Motivation(R.string.motivate15, R.drawable.overcome)
                )
    }
}