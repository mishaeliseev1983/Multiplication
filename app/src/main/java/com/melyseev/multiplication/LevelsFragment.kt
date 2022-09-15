package com.melyseev.multiplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.ViewCompat

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class FragmentLevels : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_levels, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        val buttonTestLevel = view.findViewById<Button>(R.id.test_button)
        val buttonEasyLevel = view.findViewById<Button>(R.id.easy_button)
        val buttonHardLevel = view.findViewById<Button>(R.id.hard_button)

        buttonTestLevel.setOnClickListener {
           val questionFragment = QuestionFragment.newInstance(LEVEL_TEST)
            parentFragmentManager.
            beginTransaction().
            addToBackStack(null).
            replace(R.id.container, questionFragment).
            commit()
        }

        buttonEasyLevel.setOnClickListener {
            val questionFragment = QuestionFragment.newInstance(LEVEL_EASY)
            parentFragmentManager.
            beginTransaction().
            addToBackStack(null).
            replace(R.id.container, questionFragment).
            commit()
        }

        buttonHardLevel.setOnClickListener {
            val questionFragment = QuestionFragment.newInstance(LEVEL_HARD)
            parentFragmentManager.
            beginTransaction().

            replace(R.id.container, questionFragment).
            addToBackStack(null).
            commit()
        }


        }

    companion object {
        const val LEVEL_TEST = "TEST"
        const val LEVEL_EASY = "EASY"
        const val LEVEL_HARD = "HARD"
    }

}