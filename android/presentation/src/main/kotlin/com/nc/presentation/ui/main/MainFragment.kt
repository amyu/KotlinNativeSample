package com.nc.presentation.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.nc.presentation.databinding.FragmentMainBinding
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein
import org.kodein.di.generic.instance


class MainFragment : Fragment(), KodeinAware, MainContract.View {
    override val kodein by closestKodein()

    private val presenter: MainContract.Presenter by instance()

    private lateinit var binding: FragmentMainBinding
    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        presenter.setUp(
            view = this,
            viewModel = viewModel
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        FragmentMainBinding.inflate(inflater, container, false).also {
            binding = it
            binding.viewModel = viewModel
            binding.setLifecycleOwner(this)
        }.root

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        presenter.onViewCreated()
    }
}