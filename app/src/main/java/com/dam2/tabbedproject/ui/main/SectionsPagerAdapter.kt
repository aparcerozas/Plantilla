package com.dam2.tabbedproject.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dam2.tabbedproject.R

/**
 * Array de Strings con los nombres de los Tab
 * Estas variables están guardadas en el archivo strings.xml
 */
private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * Un [FragmentPagerAdapter] que devuelve un Fragment correspondiente a
 * una de las Sections/Tabs/Pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem es llamado para instanciar un Fragment
        // usando el método newInstance de PlaceholderFragment
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Va a mostrar 3 Tab.
        return 2
    }
}