package com.onepiece.strawhatpirate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.onepiece.strawhatpirate.model.CharacterDetail
import com.onepiece.strawhatpirate.model.CharactersData

class CharacterDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_ID = "extra_id"
    }

    private lateinit var characterDetail: CharacterDetail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_detail)

        val id = intent.getIntExtra(EXTRA_ID, 0)
        characterDetail = CharactersData.getDetailData(id)
        setInfo()

        supportActionBar?.title = characterDetail.name
    }

    private fun setInfo() {
        val tvItemName: TextView = findViewById(R.id.tv_item_name)
        val tvItemDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvItemOccupation: TextView = findViewById(R.id.tv_item_occupation)
        val tvItemBounty: TextView = findViewById(R.id.tv_item_bounty)
        val imgItemPhoto: ImageView = findViewById(R.id.img_item_photo)

        tvItemName.text = characterDetail.name
        tvItemDetail.text = characterDetail.detail
        tvItemOccupation.text = characterDetail.occupation
        tvItemBounty.text = characterDetail.bounty
        imgItemPhoto.setImageResource(characterDetail.photo)
    }
}