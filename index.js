const wordsToHighlight = ["Sleep", "String", "Scanner", "int", "boolean",
];
 
const numberToHighlight = ["10", "100", "1000", "10000", "2000", "2500", "ElevatorSystem", "true", "false"];

const charToHighlight = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "for", "Thread", "while", "if", "else", "return", "this", "new", "public", "static", "import"]

const functions = ["void", "new", "scanner", "welcomeMessage", "reminder", "youArrived", "youAlready", "tryAgain", "goodbye", "currentFloor", "isRunning", "destinationFloor", "chooseFloor"];

   let sentence = document.getElementById("elevator_input").textContent;

   wordsToHighlight.forEach(word => {
     const regex = new RegExp("\\b" + word + "\\b", "g"); // Match the word
     sentence = sentence.replace(regex, `<span class="highlight">${word}</span>`); // Wrap the word in <span> with a class
   });

   numberToHighlight.forEach(word => {
    const regex = new RegExp("\\b" + word + "\\b", "g"); // Match the word
    sentence = sentence.replace(regex, `<span class="highlight2">${word}</span>`); // Wrap the word in <span> with a class
  });

  charToHighlight.forEach(word => {
    const regex = new RegExp("\\b" + word + "\\b", "g"); // Match the word
    sentence = sentence.replace(regex, `<span class="highlight3">${word}</span>`); // Wrap the word in <span> with a class
  });

  functions.forEach(word => {
    const regex = new RegExp("\\b" + word + "\\b", "g"); // Match the word
    sentence = sentence.replace(regex, `<span class="highlight4">${word}</span>`); // Wrap the word in <span> with a class
  });
  
 

   document.getElementById("elevator_input").innerHTML = sentence;
 
 