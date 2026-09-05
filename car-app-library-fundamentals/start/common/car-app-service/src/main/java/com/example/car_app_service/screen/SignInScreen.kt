package com.example.car_app_service.screen

import androidx.car.app.CarContext
import androidx.car.app.CarToast
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.InputCallback
import androidx.car.app.model.ParkedOnlyOnClickListener
import androidx.car.app.model.Template
import androidx.car.app.model.signin.InputSignInMethod
import androidx.car.app.model.signin.SignInTemplate

class SignInScreen(carContext: CarContext): Screen(carContext) {

    private var enteredPin: String = "0000"

    override fun onGetTemplate(): Template {

        val inputCallBack = object : InputCallback {
            override fun onInputTextChanged(text: String) {
                enteredPin = text
            }

            override fun onInputSubmitted(text: String) {
                verifyPinAndNavigate(text)
            }

        }

        val inputSignInMethod = InputSignInMethod.Builder(inputCallBack)
            .setHint("Enter 4-digit PIN")
            .setInputType(InputSignInMethod.INPUT_TYPE_PASSWORD)
            .setKeyboardType(InputSignInMethod.KEYBOARD_NUMBER)
            .setDefaultValue("1234")
            .build()

        val submitAction = Action.Builder()
            .setTitle("Sign In")
            .setOnClickListener(ParkedOnlyOnClickListener.create {
                verifyPinAndNavigate(enteredPin)
            })
            .build()

        return SignInTemplate
            .Builder(inputSignInMethod)
            .setTitle("Sign In With PIN")
            .setInstructions("Enter your PIN to sign in")
            .setAdditionalText("You can check the code sent to your phone")
            .setHeaderAction(Action.BACK)
            .addAction(submitAction)
            .build()
    }

    private fun verifyPinAndNavigate(enteredPin: String) {
        if (enteredPin == "1234") {
            CarToast.makeText(carContext,"Sign in successful", CarToast.LENGTH_LONG).show()
            screenManager.pop()
        } else {
            CarToast.makeText(carContext,"Incorrect PIN. Try again", CarToast.LENGTH_LONG).show()
        }
    }
}