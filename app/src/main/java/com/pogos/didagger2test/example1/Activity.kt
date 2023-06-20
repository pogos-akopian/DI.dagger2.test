package com.pogos.didagger2test.example1

import javax.inject.Inject

class Activity {


    var computer: Computer = DaggerNewComponent.create().getComputer()

    init {
        DaggerNewComponent.create().inject(this)
    }
}