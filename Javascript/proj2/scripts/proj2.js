function start() {
    let row1_column1 = document.getElementById('row1_column1');
    row1_column1.addEventListener('click', row1_column1_clicked);
    let row1_column2 = document.getElementById('row1_column2');
    row1_column2.addEventListener('click', row1_column2_clicked);
    let row1_column3 = document.getElementById('row1_column3');
    row1_column3.addEventListener('click', row1_column3_clicked);
    let row2_column1 = document.getElementById('row2_column1');
    row2_column1.addEventListener('click', row2_column1_clicked);
    let row2_column2 = document.getElementById('row2_column2');
    row2_column2.addEventListener('click', row2_column2_clicked);
    let row2_column3 = document.getElementById('row2_column3');
    row2_column3.addEventListener('click', row2_column3_clicked);
    let row3_column1 = document.getElementById('row3_column1');
    row3_column1.addEventListener('click', row3_column1_clicked);
    let row3_column2 = document.getElementById('row3_column2');
    row3_column2.addEventListener('click', row3_column2_clicked);
    let row3_column3 = document.getElementById('row3_column3');
    row3_column3.addEventListener('click', row3_column3_clicked);
    let devConsole = document.getElementById('devConsole');
    let startButton = document.getElementById('startButton');
    startButton.addEventListener('click', startButtonClicked);
    let playAgainButton = document.getElementById('playAgain');
    playAgainButton.addEventListener('click', startButtonClicked);
}

function switchTimerReadout () {
    if (isGameActive) {
        secondsPlayed += 1;
    }
    let timerReadout = document.getElementById('timer');
    timerReadout.innerHTML = 'Game Duration(Seconds): ' + secondsPlayed;
}

function startButtonClicked() {
    if (!(secondsPlayed >= 1)) {
        let timer = setInterval(switchTimerReadout, 1000);
    }
    secondsPlayed = 0;
    let radioButtonForPlayerVSPlayer = document.getElementById('radioButtonForPlayerVSPlayer');
    let radioButtonForAI = document.getElementById('radioButtonForAI');
    if (radioButtonForPlayerVSPlayer.checked) {
        AIModeActive = false;
    }
    if (radioButtonForAI.checked) {
        AIModeActive = true;
    }
    isGameActive = true;
    let row1_column1 = document.getElementById('row1_column1');
    let row1_column2 = document.getElementById('row1_column2');
    let row1_column3 = document.getElementById('row1_column3');
    let row2_column1 = document.getElementById('row2_column1');
    let row2_column2 = document.getElementById('row2_column2');
    let row2_column3 = document.getElementById('row2_column3');
    let row3_column1 = document.getElementById('row3_column1');
    let row3_column2 = document.getElementById('row3_column2');
    let row3_column3 = document.getElementById('row3_column3');
    let playAgainButton = document.getElementById('playAgain');
    playAgainButton.disabled = true;
    row1_column1.src = 'sprites/blank.png';
    row1_column2.src = 'sprites/blank.png';
    row1_column3.src = 'sprites/blank.png';
    row2_column1.src = 'sprites/blank.png';
    row2_column2.src = 'sprites/blank.png';
    row2_column3.src = 'sprites/blank.png';
    row3_column1.src = 'sprites/blank.png';
    row3_column2.src = 'sprites/blank.png';
    row3_column3.src = 'sprites/blank.png';
    r1c1 = 'n';
    r1c2 = 'n';
    r1c3 = 'n';
    r2c1 = 'n';
    r2c2 = 'n';
    r2c3 = 'n';
    r3c1 = 'n';
    r3c2 = 'n';
    r3c3 = 'n';
    if (Math.random() < 0.5) {
        itIsXTurn = true;
    }
    else {
        itIsXTurn = false;
    }
    updateUI();
    AITick();
}

function AITick() {
    if (AIModeActive && (!(itIsXTurn))) {
        let whileLoopSentinel = true;
        while (whileLoopSentinel) {
            randomNumberBetween1and9 = Math.floor(Math.random() * (9 - 1 + 1)) + 1;
            if (randomNumberBetween1and9 == 1 && r1c1 == 'n') {
                row1_column1_clicked();
                whileLoopSentinel = false;
            }
            else if (randomNumberBetween1and9 == 2 && r1c2 == 'n') {
                row1_column2_clicked();
                whileLoopSentinel = false;
            }
            else if (randomNumberBetween1and9 == 3 && r1c3 == 'n') {
                row1_column3_clicked();
                whileLoopSentinel = false;
            }
            else if (randomNumberBetween1and9 == 4 && r2c1 == 'n') {
                row2_column1_clicked();
                whileLoopSentinel = false;
            }
            else if (randomNumberBetween1and9 == 5 && r2c2 == 'n') {
                row2_column2_clicked();
                whileLoopSentinel = false;
            }
            else if (randomNumberBetween1and9 == 6 && r2c3 == 'n') {
                row2_column3_clicked();
                whileLoopSentinel = false;
            }
            else if (randomNumberBetween1and9 == 7 && r3c1 == 'n') {
                row3_column1_clicked();
                whileLoopSentinel = false;
            }
            else if (randomNumberBetween1and9 == 8 && r3c2 == 'n') {
                row3_column2_clicked();
                whileLoopSentinel = false;
            }
            else if (randomNumberBetween1and9 == 9 && r3c3 == 'n') {
                row3_column3_clicked();
                whileLoopSentinel = false;
            }
        }
    }
}

function disaplyGameResult(result) {
    let playerConsole = document.getElementById('playerConsole');
    if (result == 'x') {
        playerConsole.innerHTML = 'X won.';
    }
    if (result == 'o') {
        playerConsole.innerHTML = 'O won.';
    }
    if (result == 'c') {
        playerConsole.innerHTML = "Cat's game.";
    }
}

function gameIsOver() {
    isGameActive = false;
    let playAgainButton = document.getElementById('playAgain');
    playAgainButton.disabled = false;
}

function checkIfGameIsOver() {
    xWon = 'x';
    oWon= 'o';
    cWon= 'c';
    if (r1c1 == 'x' && r1c2 == 'x' && r1c3 == 'x') {
        disaplyGameResult(xWon);
        gameIsOver();
    }
    if (r2c1 == 'x' && r2c2 == 'x' && r2c3 == 'x') {
        disaplyGameResult(xWon);
        gameIsOver();
    }
    if (r3c1 == 'x' && r3c2 == 'x' && r3c3 == 'x') {
        disaplyGameResult(xWon);
        gameIsOver();
    }
    if (r1c1 == 'x' && r2c1 == 'x' && r3c1 == 'x') {
        disaplyGameResult(xWon);
        gameIsOver();
    }
    if (r1c2 == 'x' && r2c2 == 'x' && r3c2 == 'x') {
        disaplyGameResult(xWon);
        gameIsOver();
    }
    if (r1c3 == 'x' && r2c3 == 'x' && r3c3 == 'x') {
        disaplyGameResult(xWon);
        gameIsOver();
    }
    if (r1c1 == 'x' && r2c2 == 'x' && r3c3 == 'x') {
        disaplyGameResult(xWon);
        gameIsOver();
    }
    if (r3c1 == 'x' && r2c2 == 'x' && r1c3 == 'x') {
        disaplyGameResult(xWon);
        gameIsOver();
    }
    //
    if (r1c1 == 'o' && r1c2 == 'o' && r1c3 == 'o') {
        disaplyGameResult(oWon);
        gameIsOver();
    }
    if (r2c1 == 'o' && r2c2 == 'o' && r2c3 == 'o') {
        disaplyGameResult(oWon);
        gameIsOver();
    }
    if (r3c1 == 'o' && r3c2 == 'o' && r3c3 == 'o') {
        disaplyGameResult(oWon);
        gameIsOver();
    }
    if (r1c1 == 'o' && r2c1 == 'o' && r3c1 == 'o') {
        disaplyGameResult(oWon);
        gameIsOver();
    }
    if (r1c2 == 'o' && r2c2 == 'o' && r3c2 == 'o') {
        disaplyGameResult(oWon);
        gameIsOver();
    }
    if (r1c3 == 'o' && r2c3 == 'o' && r3c3 == 'o') {
        disaplyGameResult(oWon);
        gameIsOver();
    }
    if (r1c1 == 'o' && r2c2 == 'o' && r3c3 == 'o') {
        disaplyGameResult(oWon);
        gameIsOver();
    }
    if (r3c1 == 'o' && r2c2 == 'o' && r1c3 == 'o') {
        disaplyGameResult(oWon);
        gameIsOver();
    }
    //
    if (r1c1 != 'n' && r1c2 != 'n' && r1c3 != 'n' && r2c1 != 'n' && r2c2 != 'n' && r2c3 != 'n' && r3c1 != 'n' && r3c2 != 'n' && r3c3 != 'n') {
        disaplyGameResult(cWon);
        gameIsOver();
    }
}

function updateUI() {
    let playAgainButton = document.getElementById('playAgain');
    if (itIsXTurn) {
        playerConsole.innerHTML = "It's x's turn."
    }
    else {
        playerConsole.innerHTML = "It's o's turn."
    }
}

function row1_column1_clicked() {
    if (isGameActive && r1c1 == 'n') {
        if (itIsXTurn) {
            r1c1 = 'x';
            row1_column1.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r1c1 = 'o';
            row1_column1.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}

function row1_column2_clicked() {
    if (isGameActive && r1c2 == 'n') {
        if (itIsXTurn) {
            r1c2 = 'x';
            row1_column2.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r1c2 = 'o';
            row1_column2.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}

function row1_column3_clicked() {
    if (isGameActive && r1c3 == 'n') {
        if (itIsXTurn) {
            r1c3 = 'x';
            row1_column3.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r1c3 = 'o';
            row1_column3.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}

function row2_column1_clicked() {
    if (isGameActive && r2c1 == 'n') {
        if (itIsXTurn) {
            r2c1 = 'x';
            row2_column1.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r2c1 = 'o';
            row2_column1.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}

function row2_column2_clicked() {
    if (isGameActive && r2c2 == 'n') {
        if (itIsXTurn) {
            r2c2 = 'x';
            row2_column2.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r2c2 = 'o';
            row2_column2.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}

function row2_column3_clicked() {
    if (isGameActive && r2c3 == 'n') {
        if (itIsXTurn) {
            r2c3 = 'x';
            row2_column3.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r2c3 = 'o';
            row2_column3.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}

function row3_column1_clicked() {
    if (isGameActive && r3c1 == 'n') {
        if (itIsXTurn) {
            r3c1 = 'x';
            row3_column1.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r3c1 = 'o';
            row3_column1.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}

function row3_column2_clicked() {
    if (isGameActive && r3c2 == 'n') {
        if (itIsXTurn) {
            r3c2 = 'x';
            row3_column2.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r3c2 = 'o';
            row3_column2.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}
function row3_column3_clicked() {
    if (isGameActive && r3c3 == 'n') {
        if (itIsXTurn) {
            r3c3 = 'x';
            row3_column3.src = 'sprites/x.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
        else {
            r3c3 = 'o';
            row3_column3.src = 'sprites/o.png';
            itIsXTurn = !itIsXTurn;
            updateUI();
            checkIfGameIsOver();
            if (isGameActive) {
                AITick();
            }
        }
    }
}

window.addEventListener('load', start);
let integerThatIWillChangeAndRead = 1;
let itIsXTurn = true;
let r1c1 = 'n';
let r1c2 = 'n';
let r1c3 = 'n';
let r2c1 = 'n';
let r2c2 = 'n';
let r2c3 = 'n';
let r3c1 = 'n';
let r3c2 = 'n';
let r3c3 = 'n';
let isGameActive = false;
let AIModeActive = false;
let secondsPlayed = 0;