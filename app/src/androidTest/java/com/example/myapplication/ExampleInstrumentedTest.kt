<<<<<<< HEAD:app/src/androidTest/java/com/example/myapplication/ExampleInstrumentedTest.kt
package com.example.myapplication
=======
package com.edu.udistrital.trav
>>>>>>> main:app/src/androidTest/java/com/edu/udistrital/trav/ExampleInstrumentedTest.kt

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
<<<<<<< HEAD:app/src/androidTest/java/com/example/myapplication/ExampleInstrumentedTest.kt
        assertEquals("com.example.myapplication", appContext.packageName)
=======
        assertEquals("com.edu.udistrital.trav", appContext.packageName)
>>>>>>> main:app/src/androidTest/java/com/edu/udistrital/trav/ExampleInstrumentedTest.kt
    }
}