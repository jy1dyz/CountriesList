package com.note.countriesudemy.di

import com.note.countriesudemy.model.CountriesService
import com.note.countriesudemy.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)

}