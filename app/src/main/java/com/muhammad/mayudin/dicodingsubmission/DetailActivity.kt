package com.muhammad.mayudin.dicodingsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.BulletSpan
import android.widget.ImageView
import android.widget.TextView
import android.text.Spannable
import android.text.SpannableStringBuilder

class DetailActivity : AppCompatActivity() {

    private lateinit var imgDetailPhoto: ImageView
    private lateinit var tvDetailName: TextView
    private lateinit var tvDetailFeature: TextView
    private lateinit var spannableString: SpannableString

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        if(supportActionBar != null){
            supportActionBar?.title = "Detail"
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        imgDetailPhoto = findViewById(R.id.img_detail_photo)
        tvDetailName = findViewById(R.id.tv_detail_name)
        tvDetailFeature = findViewById(R.id.tv_detail_feature)

        val name = intent.getStringExtra(NAME)
        val release = intent.getStringExtra(RELEASE)
        val api = intent.getIntExtra(API, 0)
        val feature = intent.getStringExtra(FEATURE)
        val photo = intent.getIntExtra(PHOTO, 0)

        imgDetailPhoto.setImageResource(photo)
        val text = "$name (API $api) \nReleased $release"
        tvDetailName.text = text
        tvDetailFeature.text = addBulletToFeature(feature!!)


    }

    private fun addBulletToFeature(text: String): CharSequence{
        val splitString = text.split("\n").toTypedArray()
        val sb = SpannableStringBuilder()

        for (i in splitString.indices) {
            val line: CharSequence =
                splitString[i].toString() + if (i < splitString.size - 1) "\n" else ""
            val spannable: Spannable = SpannableString(line)

            spannable.setSpan(BulletSpan(20),
                0,
                spannable.length,
                Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            sb.append(spannable)
        }

        return sb
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    companion object {
        const val NAME = "name"
        const val RELEASE = "release"
        const val API = "api"
        const val FEATURE = "feature"
        const val PHOTO = "photo"
    }
}