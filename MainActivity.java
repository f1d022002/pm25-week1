package com.example.helloworldapp

class MainActivity : android.app.Activity() { // Menggunakan fully qualified name untuk Activity
    private lateinit var inputField: android.widget.EditText // Fully qualified name untuk EditText
    private lateinit var processButton: android.widget.Button // Fully qualified name untuk Button
    private lateinit var resultText: android.widget.TextView // Fully qualified name untuk TextView

    override fun onCreate(savedInstanceState: android.os.Bundle?) { // Fully qualified name untuk Bundle
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Pastikan file layout activity_main.xml ada

        // Inisialisasi view dengan fully qualified name
        inputField = findViewById(R.id.inputField) // Pastikan ID inputField ada di layout
        processButton = findViewById(R.id.processButton) // Pastikan ID processButton ada di layout
        resultText = findViewById(R.id.resultText) // Pastikan ID resultText ada di layout

        // Menggunakan fully qualified name untuk doAfterTextChanged
        inputField.doAfterTextChanged { editable ->
                updateResultText(editable?.toString() ?: "")
        }

        // Menggunakan fully qualified name untuk setOnClickListener
        processButton.setOnClickListener {
            val enteredText = inputField.text.toString()
            updateResultText(enteredText)
        }
    }

    private fun updateResultText(text: String) {
        // Menggunakan fully qualified name untuk TextView.setText
        resultText.text = if (text.isNotBlank()) "Hello, $text" else ""
    }
}