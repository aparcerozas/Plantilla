package com.dam2.tabbedproject.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {
    /**
     * Aquí se describe el ViewModel utilizado a la hora de crear un Fragment
     */

    private val _index = MutableLiveData<Int>()
    // Este es el texto que aparecerá en el TextView de cada Tab
    val text: LiveData<String> = Transformations.map(_index) {
        "Esta es la sección número $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}