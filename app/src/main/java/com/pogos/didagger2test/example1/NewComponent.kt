package com.pogos.didagger2test.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun getMonitor(): Monitor

    fun getMouse(): Mouse

    fun getKeyboard(): Keyboard

    fun getComputer(): Computer

    fun inject(activity: Activity)
}