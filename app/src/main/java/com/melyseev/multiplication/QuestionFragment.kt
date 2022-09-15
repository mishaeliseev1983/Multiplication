package com.melyseev.multiplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val UNDEFINED_LEVEL = ""
private const val LEVEL = UNDEFINED_LEVEL

/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment : Fragment() {
    private var level: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            level = it.getString(LEVEL, UNDEFINED_LEVEL)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_question, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.question_fragment)
        textView.text = level

    }
    companion object {
        @JvmStatic
        fun newInstance(level: String) =
            QuestionFragment().apply {
                arguments = Bundle().apply {
                    putString(LEVEL, level)
                }
            }
    }
}