package com.sam.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sam.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposableArticleHomePage()
                }
            }
        }
    }
}

@Composable
fun ComposableArticleHomePage() {

    //image res
    val bgComposeImg = R.drawable.bg_compose_background

    //text data
    val firstText = stringResource(R.string.first_text)
    val secondText = stringResource(R.string.second_text)
    val thirdText = stringResource(R.string.third_text)

    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = bgComposeImg),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(text = firstText, fontSize = 24.sp, modifier = Modifier.padding(all = 16.dp))
        Text(
            text = secondText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
        )
        Text(
            text = thirdText,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(all = 16.dp)
        )
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposeArticlePreview() {
    ComposableArticleHomePage()
}