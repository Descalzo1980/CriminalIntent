package ru.stas.criminalintent

import java.util.*

data class CrimeData(val id: UUID = UUID.randomUUID(),
                     var title: String = "",
                     var date: Date = Date(),
                     var isSolved: Boolean = false)
