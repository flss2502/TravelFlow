package io.github.flss2502.traveflow.ui.onboard

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(onFinished:() -> Unit){
    val pages = listOf(OnboardingModel.FirstPages,
        OnboardingModel.SecondPages, OnboardingModel.ThirdPages)

    val paperState = rememberPagerState(initialPage = 0) {
        pages.size
    }


    Scaffold(
        bottomBar = {
            Row(modifier = Modifier.fillMaxWidth().padding(10.dp, 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {

                ButtonUI(

                ) {

                }

                IndicatorUI(pageSize = pages.size, currentPage = paperState.currentPage)

                ButtonUI() {  }
            }
        },
        content = {
            Column(Modifier.padding(it)) {
                HorizontalPager(state = paperState) { index ->
                    OnboardingGraphUI(onboardingModel = pages[index])
                }
            }
        }
    )


}

@Preview(showBackground = true)
@Composable
fun OnboardingPreview(){
    OnboardingScreen{}
}