package com.example.a1234

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import androidx.appcompat.app.AlertDialog
import android.preference.PreferenceManager
import android.view.View


@Suppress("UNUSED_CHANGED_VALUE")
class Main2Activity : AppCompatActivity() {

    private lateinit var saveData: saveData


    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {


        saveData = saveData(this)
        if (saveData.loadDarkModeState() == true) {

            setTheme(R.style.darkTheme)

        } else
            setTheme(R.style.AppTheme)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        // 4 digits computer generates

        val y = ArrayList<Int>()
        for (i in 0..9) y.add(i)
        y.shuffle()


        // empty list for

        val x = ArrayList<Int>()

        for ((j) in (0..3).withIndex()) {
            x.add(y[j])
        }


        var counter = 1

        // retry button
        retry.setOnClickListener {

            val builder = AlertDialog.Builder(this)

            builder.setTitle("Do you want to Retry?")
            builder.setPositiveButton("Yes") { _: DialogInterface, _: Int ->

                finish()
                startActivity(Intent(this, Main2Activity::class.java))
                t_1.text = ""


            }
            builder.setNegativeButton("No") { _: DialogInterface, _: Int -> }

            builder.show()


        }


        button.setOnClickListener {

            when { editText1.text.length != 4 -> {

                }





                else -> {

                    fun main(): ArrayList<Int> {

                            val number = editText1.text.toString()
                            val list = ArrayList<Int>()

                            var counter1 = 0

                            while (counter1 < 4) {
                                // ყოველი სიმბოლოს ვაკონვერტირებთ Int - ად
                                list.add(number[counter1].toString().toInt())
                                counter1++
                            }

                        return list

                    }

                    val a0 = main()[0]
                    val a1 = main()[1]
                    val a2 = main()[2]
                    val a3 = main()[3]


                    val x0 = x[0]
                    val x1 = x[1]
                    val x2 = x[2]
                    val x3 = x[3]





                    if (a0 != a1 && a0 != a2 && a0 != a3 && a1 != a2
                        && a1 != a3 && a2 != a3 && editText1.text.length == 4
                    ) {


                        if (counter > 3) {

                            val inputManager: InputMethodManager = getSystemService(
                                Context.INPUT_METHOD_SERVICE
                            ) as InputMethodManager
                            inputManager.hideSoftInputFromWindow(
                                currentFocus?.windowToken,
                                InputMethodManager.SHOW_FORCED
                            )
                        }

                        // 4 tan
                        if (a0 == x0 && a1 == x1 && a2 == x2 && a3 == x3) {

                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "4/0"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "4/0"

                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "4/0"

                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "4/0"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "4/0"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "4/0"

                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "4/0"

                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "4/0"

                                }
                            }
                            counter++

                            Toast.makeText(this, "გილოცავთ, თქვენ მოიგეთ !", Toast.LENGTH_LONG)
                                .show()


                        }


                        // არცერთი
                        else if (a0 !in x && a1 !in x && a2 !in x && a3 !in x) {

                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "0/0"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "0/0"

                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "0/0"

                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "0/0"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "0/0"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "0/0"

                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "0/0"

                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "0/0"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }

                            counter++
                        }

                        // 3 თან

                        else if (a0 == x0 && a1 == x1 && a2 == x2 && a3 !in x
                            || a0 == x0 && a1 == x1 && a2 !in x && a3 == x3
                            || a0 == x0 && a1 !in x && a2 == x2 && a3 == x3
                            || a0 !in x && a1 == x1 && a2 == x2 && a3 == x3
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "3/0"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "3/0"

                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "3/0"


                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "3/0"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "3/0"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "3/0"

                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "3/0"

                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "3/0"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }

                            counter++

                        }

                        // 2 თან
                        else if (a0 == x0 && a1 == x1 && a2 !in x && a3 !in x
                            || a0 == x0 && a1 !in x && a2 == x2 && a3 !in x
                            || a0 == x0 && a1 !in x && a2 !in x && a3 == x3
                            || a0 !in x && a1 == x1 && a2 == x2 && a3 !in x
                            || a0 !in x && a1 == x1 && a2 !in x && a3 == x3
                            || a0 !in x && a1 !in x && a2 == x2 && a3 == x3
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "2/0"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "2/0"

                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "2/0"

                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "2/0"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "2/0"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "2/0"

                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "2/0"

                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "2/0"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                            counter++
                        }


                        // 1 თან
                        else if ((a0 == x0 && a1 !in x && a2 !in x && a3 !in x) ||
                            (a0 !in x && a1 == x1 && a2 !in x && a3 !in x) ||
                            (a0 !in x && a1 !in x && a2 == x2 && a3 !in x) ||
                            (a0 !in x && a1 !in x && a2 !in x && a3 == x3)
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "1/0"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "1/0"

                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "1/0"

                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "1/0"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "1/0"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "1/0"


                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "1/0"


                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "1/0"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()

                                }
                            }
                            counter++
                        }


                        // 4 ისე
                        else if ((a0 in x && a0 != x0) && (a1 in x && a1 != x1)
                            && (a2 in x && a2 != x2) && (a3 in x && a3 != x3)
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "0/4"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "0/4"


                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "0/4"


                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "0/4"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "0/4"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "0/4"


                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "0/4"


                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "0/4"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()

                                }
                            }

                            counter++
                        }


                        // 3 ისე
                        else if (a0 in x && a1 in x && a2 in x && a3
                            !in x && a0 != x0 && a1 != x1 && a2 != x2
                            || a0 in x && a1 in x && a2 !in x && a3
                            in x && a0 != x0 && a1 != x1 && a3 != x3
                            || a0 in x && a1 !in x && a2 in x && a3
                            in x && a0 != x0 && a2 != x2 && a3 != x3
                            || a0 !in x && a1 in x && a2 in x && a3
                            in x && a1 != x1 && a2 != x2 && a3 != x3
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "0/3"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "0/3"


                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "0/3"


                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "0/3"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "0/3"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "0/3"


                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "0/3"


                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "0/3"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()

                                }
                            }
                            counter++

                        }


                        // 2 ისე
                        else if (a0 in x && a1 in x && a2 !in x && a3 !in x && a0 != x0 && a1 != x1
                            || a0 in x && a1 !in x && a2 in x && a3 !in x && a0 != x0 && a2 != x2
                            || a0 in x && a1 !in x && a2 !in x && a3 in x && a0 != x0 && a3 != x3
                            || a0 !in x && a1 in x && a2 in x && a3 !in x && a1 != x1 && a2 != x2
                            || a0 !in x && a1 in x && a2 !in x && a3 in x && a1 != x1 && a3 != x3
                            || a0 !in x && a1 !in x && a2 in x && a3 in x && a2 != x2 && a3 != x3
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "0/2"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "0/2"


                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "0/2"


                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "0/2"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "0/2"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "0/2"


                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "0/2"


                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "0/2"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()

                                }
                            }

                            counter++
                        }


                        // 1 ისე

                        else if (a0 in x && a1 !in x && a2 !in x && a3 !in x && a0 != x0 ||
                            (a0 !in x && a1 in x && a2 !in x && a3 !in x && a1 != x1) ||
                            (a0 !in x && a1 !in x && a2 in x && a3 !in x && a2 != x2) ||
                            (a0 !in x && a1 !in x && a2 !in x && a3 in x && a3 != x3)
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "0/1"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "0/1"


                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "0/1"


                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "0/1"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "0/1"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "0/1"


                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "0/1"


                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "0/1"

                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                            counter++

                        }


                        // 2 თან   2 ისე

                        else if (a0 == x0 && a1 == x1 && a2 in x && a3 in x ||
                            a0 in x && a1 == x1 && a2 == x2 && a3 in x ||
                            a0 in x && a1 in x && a2 == x2 && a3 == x3 ||
                            a0 == x0 && a1 in x && a2 in x && a3 == x3 ||
                            a0 == x0 && a1 in x && a2 == x2 && a3 in x ||
                            a0 in x && a1 == x1 && a2 in x && a3 == x3
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "2/2"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "2/2"


                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "2/2"


                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "2/2"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "2/2"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "2/2"

                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "2/2"

                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "2/2"

                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }

                            counter++

                        }


                        // 2 თან   1 ისე
                        else if (a0 == x0 && a1 == x1 && a2 !in x && a3 in x ||
                            a0 == x0 && a1 == x1 && a2 in x && a3 !in x ||
                            a0 in x && a1 == x1 && a2 == x2 && a3 !in x ||
                            a0 !in x && a1 == x1 && a2 == x2 && a3 in x ||
                            a0 in x && a1 !in x && a2 == x2 && a3 == x3 ||
                            a0 !in x && a1 in x && a2 == x2 && a3 == x3 ||
                            a0 == x0 && a1 in x && a2 !in x && a3 == x3 ||
                            a0 == x0 && a1 !in x && a2 in x && a3 == x3 ||
                            a0 == x0 && a1 in x && a2 == x2 && a3 !in x ||
                            a0 == x0 && a1 !in x && a2 == x2 && a3 in x ||
                            a0 in x && a1 == x1 && a2 !in x && a3 == x3 ||
                            a0 !in x && a1 == x1 && a2 in x && a3 == x3
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "2/1"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "2/1"


                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "2/1"

                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "2/1"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "2/1"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "2/1"

                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "2/1"


                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "2/1"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()

                                }
                            }

                            counter++
                        }


                        // 1 თან   3 ისე

                        else if ((a0 == x0 && a1 in x && a2 in x && a3 in x) ||
                            (a0 in x && a1 == x1 && a2 in x && a3 in x) ||
                            (a0 in x && a1 in x && a2 == x2 && a3 in x) ||
                            (a0 in x && a1 in x && a2 in x && a3 == x3)
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "1/3"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "1/3"

                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "1/3"

                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "1/3"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "1/3"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "1/3"


                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "1/3"


                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "1/3"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()

                                }
                            }
                            counter++

                        }

                        // 1 თან   2 ისე
                        else if (a0 == x0 && a1 in x && a2 in x && a3 !in x ||
                            a0 == x0 && a1 in x && a2 !in x && a3 in x ||
                            a0 == x0 && a1 !in x && a2 in x && a3 in x ||
                            a0 in x && a1 == x1 && a2 in x && a3 !in x ||
                            a0 !in x && a1 == x1 && a2 in x && a3 in x ||
                            a0 in x && a1 == x1 && a2 !in x && a3 in x ||
                            a0 in x && a1 in x && a2 == x2 && a3 !in x ||
                            a0 in x && a1 !in x && a2 == x2 && a3 in x ||
                            a0 !in x && a1 in x && a2 == x2 && a3 in x ||
                            a0 in x && a1 in x && a2 !in x && a3 == x3 ||
                            a0 in x && a1 !in x && a2 in x && a3 == x3 ||
                            a0 !in x && a1 in x && a2 in x && a3 == x3
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "1/2"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "1/2"

                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "1/2"

                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "1/2"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "1/2"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "1/2"

                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "1/2"

                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "1/2"
                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                            counter++
                        }


                        // 1 თან   1 ისე
                        else if ((a0 == x0 && a1 in x && a2 !in x && a3 !in x) ||
                            (a0 == x0 && a1 !in x && a2 in x && a3 !in x) ||
                            (a0 == x0 && a1 !in x && a2 !in x && a3 in x) ||
                            (a0 in x && a1 == x1 && a2 !in x && a3 !in x) ||
                            (a0 !in x && a1 == x1 && a2 in x && a3 !in x) ||
                            (a0 !in x && a1 == x1 && a2 !in x && a3 in x) ||
                            (a0 in x && a1 !in x && a2 == x2 && a3 !in x) ||
                            (a0 !in x && a1 in x && a2 == x2 && a3 !in x) ||
                            (a0 !in x && a1 !in x && a2 == x2 && a3 in x) ||
                            (a0 in x && a1 !in x && a2 !in x && a3 == x3) ||
                            (a0 !in x && a1 in x && a2 !in x && a3 == x3) ||
                            (a0 !in x && a1 !in x && a2 in x && a3 == x3)
                        ) {
                            when (counter) {
                                1 -> {
                                    t_1.text = editText1.text.toString()
                                    T_1.text = "1/1"

                                }
                                2 -> {
                                    t_2.text = editText1.text.toString()
                                    T_2.text = "1/1"


                                }
                                3 -> {
                                    t_3.text = editText1.text.toString()
                                    T_3.text = "1/1"


                                }
                                4 -> {
                                    t_4.text = editText1.text.toString()
                                    T_4.text = "1/1"

                                }
                                5 -> {
                                    t_5.text = editText1.text.toString()
                                    T_5.text = "1/1"

                                }
                                6 -> {
                                    t_6.text = editText1.text.toString()
                                    T_6.text = "1/1"


                                }
                                7 -> {
                                    t_7.text = editText1.text.toString()
                                    T_7.text = "1/1"


                                }
                                8 -> {
                                    t_8.text = editText1.text.toString()
                                    T_8.text = "1/1"

                                    Toast.makeText(
                                        this, "სამწუხაროდ თქვენ წააგეთ :( ",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                            counter++
                        }


                        editText1.text.clear()

                    }


                }
            }

        }


    }
}