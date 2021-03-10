package com.onepiece.strawhatpirate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.onepiece.strawhatpirate.model.Character
import com.onepiece.strawhatpirate.model.CharactersData
import com.onepiece.strawhatpirate.recyclerview.CardViewCharacterAdapter
import com.onepiece.strawhatpirate.recyclerview.ListCharacterAdapter
import com.onepiece.strawhatpirate.recyclerview.OnItemClickCallback

class MainActivity : AppCompatActivity() {
    private lateinit var rvCharacters: RecyclerView
    private var list: ArrayList<Character> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle("Member List")

        rvCharacters = findViewById(R.id.rv_characters)
        rvCharacters.setHasFixedSize(true)

        list.addAll(CharactersData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                setActionBarTitle("Member List")
                showRecyclerList()
            }
            R.id.action_card_view -> {
                setActionBarTitle("Member Card View")
                showRecyclerCardView()
            }
            R.id.action_about -> {
                title = "About"
                val aboutIntent = Intent(this@MainActivity,
                    AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList() {
        rvCharacters.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListCharacterAdapter(list)
        listHeroAdapter.setOnItemClickCallback(object : OnItemClickCallback{
            override fun onItemClicked(character: Character) {
                selectCharacter(character)
            }
        })
        rvCharacters.adapter = listHeroAdapter
    }

    private fun showRecyclerCardView() {
        rvCharacters.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewCharacterAdapter(list)
        cardViewHeroAdapter.setOnItemClickCallback(object : OnItemClickCallback{
            override fun onItemClicked(character: Character) {
                selectCharacter(character)
            }
        })
        rvCharacters.adapter = cardViewHeroAdapter
    }

    private fun selectCharacter(character: Character) {
        val characterDetailIntent = Intent(this@MainActivity,
                CharacterDetailActivity::class.java)
        characterDetailIntent.putExtra(CharacterDetailActivity.EXTRA_ID, character.id)
        startActivity(characterDetailIntent)
    }
}