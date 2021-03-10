package com.onepiece.strawhatpirate.recyclerview

import com.onepiece.strawhatpirate.model.Character

interface OnItemClickCallback {
    fun onItemClicked(character: Character)
}
