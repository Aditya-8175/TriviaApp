package com.example.triviaapp.module

data class Trivia(val question: String, val answer: String, val options: List<String> = listOf())

fun getTrivia(): List<Trivia> {
    return listOf(
        // Science
        Trivia(question = "What is the smallest planet in our solar system?", answer = "Mercury", options = listOf("Mars", "Venus", "Earth")),
        Trivia(question = "What is the largest land animal on Earth?", answer = "African Bush Elephant", options = listOf("Giraffe", "Blue Whale", "Rhinoceros")),
        Trivia(question = "What is the basic unit of heredity?", answer = "Gene", options = listOf("Cell", "Chromosome", "Tissue")),
        Trivia(question = "What is the process by which plants use sunlight to create energy called?", answer = "Photosynthesis", options = listOf("Respiration", "Transpiration", "Decomposition")),
        Trivia(question = "What is the study of dinosaurs called?", answer = "Paleontology", options = listOf("Zoology", "Ecology", "Anthropology")),

        // History
        Trivia(question = "On what day did the Berlin Wall fall?", answer = "November 9, 1989", options = listOf("October 26, 1987", "December 15, 1991", "August 13, 1961")),
        Trivia(question = "Who was the first person to walk on the moon?", answer = "Neil Armstrong", options = listOf("Buzz Aldrin", "Yuri Gagarin", "Alan Shepard")),
        Trivia(question = "What was the name of the famous Aztec city?", answer = "Tenochtitlan", options = listOf("Machu Picchu", "Chichen Itza", "Teotihuacan")),
        Trivia(question = "Which war is known as the 'War of the Roses'?", answer = "Wars of the Roses", options = listOf("Hundred Years' War", "French and Indian War", "American Civil War")),
        Trivia(question = "Who painted the Mona Lisa?", answer = "Leonardo da Vinci", options = listOf("Michelangelo", "Sandro Botticelli", "Raphael")),

        // Geography
        Trivia(question = "What is the tallest mountain in the world?", answer = "Mount Everest", options = listOf("K2", "Kangchenjunga", "Lhotse")),
        Trivia(question = "What is the driest desert in the world?", answer = "Atacama Desert", options = listOf("Sahara Desert", "Gobi Desert", "Australian Outback")),
        Trivia(question = "What is the longest river in the world?", answer = "Nile River", options = listOf("Amazon River", "Yangtze River", "Mississippi River")),
        Trivia(question = "Which country has the most lakes?", answer = "Canada", options = listOf("Russia", "Finland", "Sweden")),
        Trivia(question = "On which continent is the Great Barrier Reef located?", answer = "Australia", options = listOf("Asia", "Africa", "South America")),

        // Literature
        Trivia(question = "Who wrote the novel 'Pride and Prejudice'?", answer = "Jane Austen", options = listOf("Charlotte Brontë", "Charles Dickens", "William Shakespeare")),
        Trivia(question = "What is the name of the hobbit who embarks on a journey in 'The Lord of the Rings'?", answer = "Frodo Baggins", options = listOf("Bilbo Baggins", "Gandalf", "Aragorn")),
        Trivia(question = "What is the famous play by William Shakespeare that features star-crossed lovers?", answer = "Romeo and Juliet", options = listOf("Hamlet", "Macbeth", "King Lear")),
        Trivia(question = "Who wrote the poem 'Ode to a Nightingale'?", answer = "John Keats", options = listOf("William Wordsworth", "Lord Byron", "Percy Bysshe Shelley")),
        Trivia(question = "What is the name of the dystopian novel by George Orwell?", answer = "1984", options = listOf("Animal Farm", "Brave New World", "Fahrenheit 451")),

        // General Knowledge
        Trivia(question = "What is the capital of France?", answer = "Paris", options = listOf("London", "Berlin", "Rome")),
        Trivia(question = "What is the world's most popular sport?", answer = "Association Football (Soccer)", options = listOf("Cricket", "Basketball", "Baseball")),
        Trivia(question = "What is the chemical symbol for gold?", answer = "Au", options = listOf("Ag", "Cu", "Fe")),

        )
}



