package io.github.flss2502.traveflow.ui.onboard

import androidx.annotation.DrawableRes
import io.github.flss2502.traveflow.R

sealed class OnboardingModel (
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
) {
    data object FirstPages: OnboardingModel(
        image = R.drawable.img_into_1,
        title = "Lorem Ipsum Dolor Sit Amet",
        description = "Amet"
    )

    data object SecondPages: OnboardingModel(
        image = R.drawable.img_into_2,
        title = "Lorem Ipsum Dolor Sit Amet",
        description = "Amet"
    )

    data object ThirdPages: OnboardingModel(
        image = R.drawable.img_into_3 ,
        title = "Lorem Ipsum Dolor Sit Amet",
        description = "Amet"
    )
}